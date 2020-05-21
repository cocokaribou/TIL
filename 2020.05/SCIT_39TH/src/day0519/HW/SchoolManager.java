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
            for(int i=0; i<count; i++){
                Student s = (Student)h;
                Student s1 = (Student)arr[i];

                String input = s.getSsn(); //입력받은 객체의 학번
                String sn = s1.getSsn(); //먼저 저장된 배열요소 속 객체의 학번

                if(input.equals(sn)) return false;
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

        // public boolean insertHuman(Human h){
        //     for(int i = 0; i<count; i++){
        //         Human temp = arr[i];

        //         boolean result = h.getSn().equals(temp.getSn());
        //         if (result) return false;
        //     }
        //     arr[count++]=h;
        //     return true;
        // }

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