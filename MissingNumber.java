
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber  {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        Arrays.sort(arr);
        for(int i =0; i<n; i++)
        {
          arr[i]= sc.nextInt();
        }
        for(int j=1; j<=n; j++)
        {
                  boolean found = false;
                  for(int k=0; k<n; k++)
                              {
                    if(arr[k]==j){
                      found = true;
                    break;
                    }
                  }
                   if(found==false){
                  System.out.print(j+"missing num in this array");
                }
                }
               
    }
}

