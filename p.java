import java.util.Scanner;

public class p

 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
      for(int i=1;i<=n;i++)
      {
        int count=0;
    for(int j=1;j<=i;j++)
    {
     if(i%j==0)     
    {
        count++;
    }
}
    if(count==2)
        {
            System.out.println(i);
        }

        }

        }
        else
        {
        System.out.println("0");
        }
    }
    }
    
