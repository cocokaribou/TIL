package test.ui;

import java.util.*;

import test.vo.Player;
import test.dao.PlayerDAO;


public class PlayUI {
    private String[] rcp = {"scissors", "rock", "paper"};
    private String computer;
        

    private Scanner sc = new Scanner(System.in);
    private PlayerDAO dao = new PlayerDAO();

    public PlayUI(){
        while(true){
            printMainMenu();
            int select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
                    createPlayer();
                    break;
                case 2:
                    selectPlayer();
                    break;
                case 3:
                    ranklist();
                    break;
                case 4:
                    listAll();
                    break;
                case 5:
                    deletMenu();
                    break;
                case 0:
                    System.out.println("exit the program.");
                    return;
            }
        }

    }
    
    public void printMainMenu(){        
        System.out.println("----------------------");
        System.out.println(" rcp program");
        System.out.println("----------------------");
        System.out.println("1. create player");
        System.out.println("2. rcp game");
        System.out.println("3. rank");
        System.out.println("4. list all player info");
        System.out.println("5. delete player");
        System.out.println("0. exit");
        System.out.println("----------------------");
        System.out.print("select menu : ");
        
    }

    public void createPlayer(){
        System.out.println("[create player]");
        System.out.println("----------------------");
        System.out.print("input player name: ");
        String name = sc.nextLine();
        
        Player p = new Player(name);
        int result = dao.createPlayer(p);
        if(result == 0){
            System.out.println("----------------------");
            System.out.println("\n\t★ failed in creating player!\n");
            return;
        }
        System.out.println("----------------------");
        System.out.println("\n\t★ new player created!\n"); 
        System.out.print("want to play game right away? (y/n): ");
        String select = sc.nextLine();
        if(select.equals("y\n") || select.equals("y") || select.equals("Y\n") || select.equals("Y")){
            System.err.println("\n\t★ player "+name+", starting the game ★\n");
            p = dao.selectByName(name);
            rcpGame(p);
     }
    }  

    public void selectPlayer(){
        System.out.println("[Rock Paper Scissors game]\n");
        ArrayList<Player> list = dao.listAll();
        if(list == null){
            System.out.println("\n\t★ no player has been added!");
            return;
        }
        System.out.println("---player list---");
        ArrayList<Player> names = dao.printName();
        System.out.println();
        
        Player p1 = null;
        
        if(names != null){
            for(Player temp : names) System.out.print(temp.getName()+"\t");
            System.out.print("\n\nchoose your player : ");
            String name = sc.nextLine();
    
            p1 = dao.selectByName(name);
            if(p1 != null) {
                System.err.println("\n\t★ player "+name+", starting the game ★\n");
                rcpGame(p1);
            }
        }
        System.out.println("please choose the player among the list!\n");
        return;
    }

    
    public void rcpGame(Player p){
        while(true){
            System.out.print("type \'rock\'  \'paper\'  \'scissors\': ");
            String rcp = sc.nextLine();
            if(!rcp.equals("scissors") && !rcp.equals("rock") && !rcp.equals("paper")){
                System.out.println("\n\t★ please choose among \'rock\' \'paper\' \'scissors\'\t");
                continue;
            }
            
            int result = rcpResult(rcp);
            System.out.println("-----------------------------\n");
            System.out.println("\t"+rcp+" vs "+computer);

            if(result == -1){
                System.out.println("\n\t★ you lose!");
                total_incre(p);
                lose_incre(p);
            }
            else if(result == 1){
                System.out.println("\n\t★ you win!");
                total_incre(p);
                win_incre(p);
            }
            else if (result ==0){
                System.out.println("\n\t★ draw!");
                total_incre(p);
            }
            System.out.println("\n-----------------------------");

            System.out.print("\ncontinue playing the game? (y/n): ");
            String select = sc.nextLine();
            if(select.equals("n\n") || select.equals("n")) break;
        }
        System.out.println();
        return;
    }

    public int rcpResult(String input){
        int player = 0;
        
        if(input.equals("scissors")) player = 0;
        else if(input.equals("rock")) player = 1;
        else if(input.equals("paper")) player = 2;
        
        Random rand = new Random();
        int com = rand.nextInt(3);

        computer = rcp[com];

        int result = 0;
        
        if(player == com) result = 0;
        else if ((player==0 && com ==1) || (player==1 && com ==2) || (player==2 && com == 0)) result = -1;
        else result= 1;

        return result;
    }

    public void win_incre(Player p){
        dao.winIncre(p);
    }   
    public void lose_incre(Player p){
        dao.loseIncre(p);
    }   
    public void total_incre(Player p){
        dao.totalIncre(p);
    }


    //wincount / totalcount = winrate
    //승률이 높은 순으로 player 이름 출력

    //플레이어(외래키)와 승률을 칼럼으로 갖는 테이블을 만들면 되는데..
    //테이블 두 개를 연동시키는 방법을 몰라서 일단 java에서 map으로 정렬시켜봄
    
    public void ranklist(){
        System.out.println("[rank]");
        ArrayList<Player> result = dao.listAll();
        if (result == null){
            System.out.println("\n\t★ no player has been added!");
            return;
        }
        
        int i = 1;
        for(Player player: result) {
            double win = player.getWin_count();
            double total = player.getTotal_count();
            double winrate = (win/total)*100.0;
            if(winrate<0) winrate = 0.0;

            //map에 데이터 추가
            //<플레이어이름, 승률>
            //TreeMap으로 정렬시키려고 승률을 key로 두려고 하니 key 값은 중복 불가..

            Map<String,Double> map = new HashMap<String, Double>();
            map.put(player.getName(), winrate);
            
            //
            List<String> keySetList = new ArrayList<>(map.keySet());

            Collections.sort(keySetList, (o1,o2) -> (map.get(o1).compareTo(map.get(o2))));
            for(String key:keySetList){
                System.out.printf("\n\t#%d %s\twinning rate: %.2f",i,player.getName(), map.get(key));
                i++;
            }
            System.out.println();
        }
        
    }


    public void listAll(){
        System.out.println("[list all players info]");
        ArrayList<Player> result = dao.listAll();
        if (result == null){
            System.out.println("\n\t★ no player has been added!");
            return;
        }
        for(Player player: result) System.out.println(player);
    }

    public void deletMenu(){
        System.out.println("[delete player]");
        ArrayList<Player> temp = dao.listAll();
        if (temp == null){
            System.out.println("\n\t★ no player has been added!");
            return;
        }
        for(Player player: temp) System.out.println(player);
        System.out.print("\ninput id num you'd like to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        int result = dao.deletePlayer(id);
        if(result == 0){
            System.out.println("----------------------");
            System.out.println("\n\t★ failed in deleting player!\n");
            return;
        }
        System.out.println("----------------------");
        System.out.println("\n\t★ existing player deleted!\n");
    }

}