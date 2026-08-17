import java.util.Scanner;

public class buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
       
            int rem = temp%10;
            if(n%7==0 || rem==7){
                System.out.println("Buzz Number");
            }
            else
            {
                System.err.println("not a Buzz number");
            }
        }
    }
  
