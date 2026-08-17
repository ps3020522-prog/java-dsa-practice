import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//         int b = sc.nextInt();
//         int value = 0;
//         int temp;
//        int large = 0;
//         if(a>b)
//         {
//            temp = a;
//         }
//         else{
//             temp = b;
//         }
//         for(int i =1; i<temp; i++)
//         {
//             if(a%i==0 && b%i==0)
//             {
//                 value = i;
//                 System.out.print(value+("  "));
//             }

//         }
        
//     }
// }
int reve = 0;
int temp = a;
while(a>0)
{
    int rem = a%10;
    reve = (reve*10) + rem;
    a = a/10;
}
if(reve==temp)
System.out.println("Pali");
else
    System.out.println("Not");
    }
}