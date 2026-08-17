import java.util.Scanner;

public class alphabetPattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++)
        {
            for(int j=1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++)
            {
                if((i==3 && j==2) || (i==5 && j>1 && j<5))
                {
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}
