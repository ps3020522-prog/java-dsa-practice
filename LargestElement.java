import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int larg = 0;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
   
        for(int i=0; i<n; i++)
        {
            
            if(arr[i]>=larg)
            {
                larg= arr[i];
            }

            }
            System.out.println(larg+ " is largest value in array");
    }

}
