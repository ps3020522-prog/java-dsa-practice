import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int count =0;
        while(n!=0){
            int rem =  n%10;
           // count++;
           count +=rem;
            n = n/10;
        }
        System.out.println("Total digit are "+count);
    }
    
}
