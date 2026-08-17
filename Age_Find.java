import java.util.Scanner;

public class Age_Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the age");
        int age = sc.nextInt();
        if(age<12){
            System.out.println("Child");
            }
            else if(age>=12 && age<18){
                System.err.println("Teenager");
            }
            else{
                System.err.println("Adult");
            }
        }

    }
    

