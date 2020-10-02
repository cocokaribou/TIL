class Car 
{   
   static int speed;

   public static void setSpeed(int a){
      speed = a;
   }

   public static void run(){
      System.out.println(speed + "으로 달립니다.");
   }

   public static void main(String[] args)
   {   
      setSpeed(5);
      run();
   }
}
