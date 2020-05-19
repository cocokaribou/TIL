package day0519.HW;

public class SchoolManager {
    private Human[] arr = new Human[100];
    private int count = 0;

    public boolean insertHuman(Human h){
        boolean flag = false;

        if(count==0){
            arr[count++] = h;
            flag = true;
        }
        else{
            for(int i=0; i<count; i++){
                String input = h.getSn(); //입력받은 객체의 주민번호
                String sn = arr[i].getSn(); //먼저 저장된 배열요소 속 객체의 주민번호

                if(input.equals(sn)){
                    flag = false;
                    break;
                }
                else{
                    arr[count++] = h;
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }

    public void printAll(){
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