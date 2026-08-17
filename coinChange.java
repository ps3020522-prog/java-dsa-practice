import java.util.Scanner;

public class coinChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        int count;

        count = amount / 500;
        System.out.println("500 = " + count);
        amount = amount % 500;

        count = amount / 200;
        System.out.println("200 = " + count);
        amount = amount % 200;

        count = amount / 100;
        System.out.println("100 = " + count);
        amount = amount % 100;

        count = amount / 50;
        System.out.println("50 = " + count);
        amount = amount % 50;

        count = amount / 20;
        System.out.println("20 = " + count);
        amount = amount % 20;

        count = amount / 10;
        System.out.println("10 = " + count);
        amount = amount % 10;

        count = amount / 5;
        System.out.println("5 = " + count);
        amount = amount % 5;

        count = amount / 2;
        System.out.println("2 = " + count);
        amount = amount % 2;

        count = amount / 1;
        System.out.println("1 = " + count);

        sc.close();
    }
}