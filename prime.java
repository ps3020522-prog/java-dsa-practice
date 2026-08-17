import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n<=0){
            if(n<=1 ){
                System.out.println("Not Prime num");
            if(n==2 || n==3){
                System.out.println("Prime num");
            }
            if(n%2==0 || n%3==0){
                System.out.println("Not prime");
            }
              for(int i= 5; i<Math.sqrt(n); i=i+6){
                if(n%i==0 || n%(i+2)==0){
                    System.out.println("Not prime num");
                }
                else{
                    System.out.println("Prime num");
                }
              }
        }
    }
 }
}
