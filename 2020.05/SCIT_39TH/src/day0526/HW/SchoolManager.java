package day0526.HW;

import java.util.ArrayList;

public class SchoolManager {
    private ArrayList<Human> arr = new ArrayList<Human>();

    public boolean insertHuman(Human h){
        if(arr.size() == 0){
            arr.add(h);
            return true;
        }
        for(int i =0; i<arr.size(); i++){
            Human temp = arr.get(i);

            if(h instanceof Student && temp instanceof Student){
                Student s1 = (Student)h;
                Student s2 = (Student)temp;
    
                if(s1.getSsn().equals(s2.getSsn())) return false;
            }
            else{
                String input = h.getSn(); //입력받은 객체의 주민번호
                String sn = temp.getSn(); //먼저 저장된 배열요소 속 객체의 주민번호

                if(input.equals(sn)) return false;
            }
        }
        arr.add(h);
        return true;
    }

    //주민번호를 전달받아 Human 객체를 반환하는 method
    //매개변수로 전달받은 주민번호와 동일한 주민번호를 갖는 Human 객체가 field 의 Human 배열에 존재할 경우 해당 객체를 반환함
    //매개변수로 전달받은 주민번호와 일치하는 Human 객체가 존재하지 않을 경우, null 을 반환함

    public int returnIndex(Human h){
        int index = 0;
        for(int i=0; i<arr.size(); i++){
            if(h==arr.get(i))
                index = i+1;

        }return index;
    }

    public Human findHuman(String input){
        for(int i =0; i<arr.size(); i++){
            Human human = arr.get(i);
            String sn = human.getSn();
            
            if(input.equals(sn)){
                return human;
            }
        }
        return null;
    }

    //Human 객체를 전달받아 field의 Human 배열에서 일치하는 객체를 삭제하는 method
    //매개변수로 전달받은 Human 객체와 동일한 주소값을 갖는 Human 객체가
    //field의 Human 배열에 존재할 경우, 해당 객체를 삭제하고 field의 count 변수의 값을 1 감소시키고 true 반환

    public boolean deleteHuman(Human h){
        for(int i =0; i<arr.size(); i++){
            Human temp = arr.get(i);
            if(temp == h){
                arr.remove(i);
                return true;
            }
        }
        return false;
    }

    
    public void printAll(){
        if(arr.size() == 0){
            System.out.println("등록정보 없음");
            return;
        }
        for (int i=0; i<arr.size(); i++){
            System.out.print("no."+(i+1)+" ");
            if(arr.get(i) instanceof Student) System.out.println("학생");
            else if(arr.get(i) instanceof Staff) System.out.println("스태프");
            else if(arr.get(i) instanceof Professor) System.out.println("교수");
            
            arr.get(i).print();
            System.out.println();
        }
    }
}