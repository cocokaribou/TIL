package day0519.HW;


public class SchoolManager {
    private Human[] arr = new Human[100];
    private int count = 0;

    public boolean insertHuman(Human h){
        if(count==0 && arr[count] == null){
            arr[count++] = h;
            return true;
        }
        else if(h instanceof Student){
            Student s = (Student)h;
            for(int i=0; i<count; i++){
                if (arr[i] instanceof Student) {
                    Student s1 = (Student)arr[i];
                    String input = s.getSsn(); //입력받은 객체의 학번
                    String sn = s1.getSsn(); //먼저 저장된 배열요소 속 객체의 학번
                    
                    if(input.equals(sn)) return false;
                }
            }
        }
        else{
            for(int i=0; i<count; i++){
                String input = h.getSn(); //입력받은 객체의 주민번호
                String sn = arr[i].getSn(); //먼저 저장된 배열요소 속 객체의 주민번호

                if(input.equals(sn)) return false;
            }
        }
        arr[count++] = h;
        return true;
    }

    //주민번호를 전달받아 Human 객체를 반환하는 method
    //매개변수로 전달받은 주민번호와 동일한 주민번호를 갖는 Human 객체가 field 의 Human 배열에 존재할 경우 해당 객체를 반환함
    //매개변수로 전달받은 주민번호와 일치하는 Human 객체가 존재하지 않을 경우, null 을 반환함

    public int returnIndex(Human h){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(h==arr[i])
                index = i+1;

        }return index;
    }

    public Human findHuman(String input){
        for(int i =0; i<count; i++){
            Human human = arr[i];
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
        for(int i =0; i<count; i++){
            if(arr[i] == h){
                arr[i] = null;
                for(int j = i; j<count; j++){
                    arr[j] = arr[j+1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    
    public void printAll(){
        if(count == 0 && arr[0] == null){
            System.out.println("등록정보 없음");
            return;
        }
        for (int i=0; i<count; i++){
            System.out.print("no."+(i+1)+" ");
            if(arr[i]instanceof Student) System.out.println("학생");
            else if(arr[i]instanceof Staff) System.out.println("스태프");
            else if(arr[i]instanceof Professor) System.out.println("교수");
            
            arr[i].print();
            System.out.println();
        }
    }
}