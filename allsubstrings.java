import java.util.*;
public class allsubstrings{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] arr  = new int[a];
    int even =0;
    int odd=0;
    for(int i =0; i<a ; i++)
    {
        arr[i] = sc.nextInt();
    }
 for(int i =0; i<a ; i++)
    {
    if(arr[i]%2==0){
 even++;
    }
    }
 
    System.out.print("Even num"+even);

}
}
