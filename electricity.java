 import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
         Scanner sc = new Scanner(System.in);
         int bill = 0;
         int units = sc.nextInt();
         if(units<=100){
             bill = units*10;
         }
      else if(units<200){
         bill = (100*10) + (units-100)*15  ;
      }
      else if(units<300)
      {
        bill= (100*10) + (100*15) + (units-200)*20;

      }
      else
      {
        bill= (100*10) + (100*15) + (units-200)*20 + (units-300);

      }
      System.out.println(bill);
}
    
 
 
}
