
import java.util.Scanner;
public class countNumberOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while(x>0)
        {
            if(x%10!=0)
            {
                count++;
            }
            x = x/10;

        }
        System.out.print(count);

}
    
}
