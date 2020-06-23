package test.ui;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

import test.vo.Player;
import test.dao.PlayerDAO;


public class PlayUI {
    private String[] rcp = {"scissors", "rock", "paper"};
    private String computer;

    Scanner sc = new Scanner(System.in);
    PlayerDAO dao = new PlayerDAO();

    public PlayUI(){
        while(true){
            printMainMenu();
            int select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
                    createPlayerMenu();
                    break;
                case 2:
                    rcpMenu();
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
        System.out.println("2. rcp");
        System.out.println("3. rank");
        System.out.println("4. list all player info");
        System.out.println("5. delete player");
        System.out.println("0. exit");
        System.out.println("----------------------");
        System.out.print("select menu : ");
        
    }

    public void createPlayerMenu(){
        System.out.println("[create player]");
        System.out.println("----------------------");
        System.out.print("input player name: ");
        String name = sc.nextLine();

        Player p = new Player(name);
        int result = dao.createPlayer(p);
        if(result == 0){
            System.out.println("----------------------");
            System.out.println("failed in creating player!\n");
            return;
        }
        System.out.println("----------------------");
        System.out.println("* new player created!\n");
        
               
    }
    
    public Player selectPlayer(){
        ArrayList<Player> list = dao.printName();
        for(Player temp : list) System.out.println("---------\n"+temp.getName()+"\n---------");
        System.out.print("choose your player : ");
        String name = sc.nextLine();

        Player p1 = dao.selectByName(name);
        if(p1 != null) {
            System.err.println("player "+name+", starting the game");
            return p1;
        }
        else {
            System.out.println("please choose the player among the list.\n");
            return p1;
        }
    }

    public void rcpMenu(){
        while(true){
            System.out.println("[Rock Paper Scissors game]");
            Player p = selectPlayer();
            if(p==null) return;

            System.out.println("----------------------");
            System.out.print("\'rock\' \'paper\', \'scissors\' choose one: ");
            String rcp = sc.nextLine();
            if(!rcp.equals("scissors") && !rcp.equals("rock") && !rcp.equals("paper")){
                System.out.println("please choose among \'rock\' \'paper\' \'scissors\'");
                continue;
            }
            
            int result = rcpGame(rcp);
            if(result == -1){

                System.out.println("you: "+rcp);
                System.out.println("computer: "+computer);

                System.out.println("you lose!");
                total_incre(p);
                lose_incre(p);
                return;
            }
            else if(result == 1){
                System.out.println("you: "+rcp);
                System.out.println("computer: "+computer);

                System.out.println("you win!");
                total_incre(p);
                win_incre(p);
                return;
            }
            else if (result ==0){
                System.out.println("you: "+rcp);
                System.out.println("computer: "+computer);

                System.out.println("draw!");
                total_incre(p);
                return;
            }
        }

    }

    public int rcpGame(String input){
        int player = 0;
        
        if(input.equals("scissors")) player = 1;
        else if(input.equals("rock")) player = 2;
        else if(input.equals("paper")) player = 3;
        
        Random rand = new Random();
        int com = rand.nextInt(3)+1;

        computer = rcp[com];

        int result = 0;
        
        if(player == com) result = 0;
        else if ((player==1 && com ==2) && (player==2 && com ==3) && (player==3 && com == 1)) result = -1;
        else result = 1;

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


    public void ranklist(){
        System.out.println("[rank]");
        ArrayList<Player> result = dao.ranklist();
        for(Player player: result) System.out.println(player);
    }

    public void listAll(){
        System.out.println("[list all players info]");
        ArrayList<Player> result = dao.ranklist();
        for(Player player: result) System.out.println(player);
    }

    public void deletMenu(){
        System.out.println("[delete player]");
        ArrayList<Player> list = dao.ranklist();
        for(Player player: list) System.out.println(player);
        System.out.print("input id num you'd like to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        int result = dao.deletePlayer(id);
        if(result == 0){
            System.out.println("----------------------");
            System.out.println("failed in deleting player!\n");
            return;
        }
        System.out.println("----------------------");
        System.out.println("* existing player deleted!\n");
    }

}