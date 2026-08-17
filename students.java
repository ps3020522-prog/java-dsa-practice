import java.util.*;
public class students {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int small = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;
        long sum=0;
        long secondlar = 0;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
             sum+=arr[i];
             if(arr[i]<small)
             {
                small=arr[i];
             }
            if(arr[i]>=larg)
            { 
                secondlar = larg;
                larg= arr[i];

            }
            else if(arr[i]>secondlar && arr[i]!=larg)
            {
                secondlar = arr[i];
            }
            }       
          double average = (float)sum/n;
          System.out.println(larg+ " is largest value in array \n" + average + " is average marks in the class\n"+small + " smallest\n"+ secondlar + " is second largest value");
          System.out.println("Value to Search");
          int value = sc.nextInt();
          boolean found = false;
          for(int i =0; i<n; i++)
          {
          if(arr[i]==value)
            {
                found=true;
                break;
            }  
        }   
        if(found)
            System.out.println("Find value");
        else 
            System.out.println("Not find ");
}
}
