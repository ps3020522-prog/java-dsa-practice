import java.util.Scanner;

public class cubeofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cube = 0;
        for(int i =1; i<=n; i++)
        {
             cube = i*i*i;
           
        }
        System.out.println(cube +" "+ "is " + n +" number cube");
    }
}
