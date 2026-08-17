import java.util.Scanner ;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();
        System.out.println("Name is "+name);


        System.out.print("Enter ypor Lucky number");
        int num_1 = sc.nextInt();

        System.out.println("lucky number is "+num_1);
    }
}
