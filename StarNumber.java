import java.util.Scanner;

public class StarNumber {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // for(int i = 1; i<=a; i++){
    //     for(int j = 1; j<=i; j++)
    //     {
    //         if(j%2==0){
    //         System.out.print("#");
    //         }
    //         else{
    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println();
    // }
    for(int i =1; i<=5; i++){
        for(int j =a; j>=i; j--)
        {
            System.out.print(j);
        }
         System.out.println();
    }
   
 }   
}
