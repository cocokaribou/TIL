package test.ui;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

import test.vo.Player;
import test.dao.PlayerDAO;


public class PlayUI {
    Scanner sc = new Scanner(System.in);
    PlayerDAO dao = new PlayerDAO();

    public PlayUI(){
        while(true){
            printMainMenu();
            int select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
            }
        }

    }
    
    public void printMainMenu(){        
        System.out.println("----------------------");
        System.out.println("  가위바위보 program");
        System.out.println("----------------------");
        System.out.println("1. 플레이어 등록");
        System.out.println("2. 가위바위보");
        System.out.println("3. 승패 확인");
        System.out.println("4. 승률 확인");
        System.out.println("0. 종료");
        System.out.println("----------------------");
        System.out.print("입력 : ");
        
    }

    public void createPlayerMenu(){
        System.out.println("플레이어 등록");
        System.out.println("----------------------");
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        sc.nextLine();
        
        Player insert = new Player(name);
        int result = dao.createPlayer(insert);
        if(result == 0){
            System.out.println("----------------------");
            System.out.println("플레이어 등록 실패!\n");
            return;
        }else{
            System.out.println("----------------------");
            System.out.println("* 등록되었습니다!\n");
        }
               
    }

    public void rcpMenu(String input){
        while(true){
            System.out.println("가위바위보");
            System.out.print("플레이어를 선택하세요: ");
            

            System.out.println("----------------------");
            System.out.print("\'가위\', \'바위\', \'보\' 중에 하나를 입력하세요: ");
            String rcp = sc.nextLine();
            sc.nextLine();

            if(rcpGame(rcp) == -1){
                
            }
        }

    }

    public Player selectPlayer(String input){
        ArrayList<Player> list = dao.printName();
        for(Player temp : list) System.out.println(temp.getName());
        System.out.println("플레이어 이름을 선택하세요: ");
        String name = sc.nextLine();

        Player player = new Player(name);



    }

    public int rcpGame(String input){
        int i = 0;
        int result = 0;

        if(input.equals("가위")) i = 1;
        else if(input.equals("바위")) i = 2;
        else if(input.equals("보")) i = 3;
        else System.out.println("\'가위\' \'바위\' \'보\' 중에 입력해주세요");

        Random rand = new Random();
        int com = rand.nextInt(3)+1;
        
        if(i == com) result = 0;//비김
        else if ((i==1 && com ==2) && (i==2 && com ==3) && (i==3 && com == 1)) result = -1; //짐
        else result = 1; //이김

        return result;
    }

    public void win_incre(){
        dao.winIncre();
    }   

}