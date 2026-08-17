import java.util.Scanner;

public class foreachloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size]; 
        int i ; 
        for( i =0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println(a);
    }
    
}
