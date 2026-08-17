import java.util.Scanner;

public class pramidPattern {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j =1; j<(n-i)*2; j++)
            {
            System.out.print("  ");
            }
        for(int j =(n-i+1); j<=(n); j++)
        {
            System.out.print(j +" ");
        }
        for(int j = (n-i); j>=(n-i+1); j-- )
        {
            System.out.print(j +" ");
           
        }
        
      System.out.println(" ");
    }
}
}
