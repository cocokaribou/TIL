public class App {
    public static void main(String[] args) {
        int[] arr ={4,2,3,5,1};

        for(int i=1; i<5; i++){
            int standard = arr[i];//기준
            int aux = i-1; //비교대상
            
            while(aux >= 0&& standard<arr[aux]){
                arr[aux+1] = arr[aux]; //비교대상이 큰 경우
                //오른쪽으로 밀어냄
                aux--;
            }
            arr[aux+1] = standard; //기준값 저장        
        }

        //정렬된 배열 출력
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]+" ");
        }
    }
}
