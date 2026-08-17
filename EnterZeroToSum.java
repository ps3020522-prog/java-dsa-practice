
import java.util.Scanner;
public class EnterZeroToSum {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int x ;
    int largest =0;
    do{
         x = sc.nextInt();
        if(x>=largest)
        {
            largest=x;
        }
    }while(x!=0);
        System.out.print("Largest  "+ largest );
    
}
}
