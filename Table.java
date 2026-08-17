import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tble ;
        for(int i = 1; i<=10; i++)
        {
           tble = x*i ;
    System.out.println(x + " x " + i + " = " +tble);
        }
    }
    
}
