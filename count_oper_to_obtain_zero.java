import java.util.Scanner;

public class count_oper_to_obtain_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sub =0;
      int count =0;
      while(num1!=0 && num2!=0)
      {
        if(num1>=num2 )
        {
        count+=num1/num2;
        num1 = num1%num2;
      }  else{
       count+=num2/num1;
        num2 = num2%num1;
      }
      }
      System.out.println(count);
    }
}
