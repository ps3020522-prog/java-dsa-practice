import java.util.Scanner;

public class double_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        int rem;
        int temp = num;
        while(temp!=0)
        {
            rem= temp%10;
            rev = rev*10+rem;
            temp=temp/10;
    
    
            }   
            int dourev=0;
            while(rev!=0){
            int digi = rev%10;
            dourev=dourev*10+digi;
            rev = rev/10;
    
           }
           if(dourev==num){
            System.out.println("true");
           }
           else
           System.out.println("False");
         }

    
}
