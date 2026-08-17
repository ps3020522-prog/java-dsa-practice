import java.util.Scanner;

public class B_Pattern {
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
        for(int j = 1; j<=n-2; j++)
        {
            if((i==1 && j==5) || (i==2 && j>2 && j<5) || (i==3 && j>2 && j<5) || (i==4 && j==5) || (i==7 && j>2 && j<5) || (i==5 && j>2 && j<5) || (i==6 && j==5))
                System.out.print("  ");
            else
                System.out.print("* ");

        }
        System.out.println("  ");
    }
}    
}
