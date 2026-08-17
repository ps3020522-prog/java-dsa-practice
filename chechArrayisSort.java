import java.util.Arrays;
import java.util.Scanner;

public class chechArrayisSort {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Copy array
        int copy[] = Arrays.copyOf(arr, n);

        // Sort copy
        Arrays.sort(copy);

        // Compare
        if (Arrays.equals(arr, copy)) {
            System.out.println("Sorted Array");
        } else {
            System.out.println("Not Sorted");
        }
    }
}