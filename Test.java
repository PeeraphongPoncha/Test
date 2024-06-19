public class Test{
   public test{}
   

    public static void main(String[] args) {
         float x = 1;
         int y = 2;
         float newx ;
         for(int i = 1; i<6 ;i++){
             newx = (x+(y/x))/2;
             System.out.print(i);
             System.out.print("  ");
             System.out.println(newx);
             x = newx;
             }
    }
}
