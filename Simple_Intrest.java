import java.util.Scanner;
public class Simple_Intrest {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter pr");
    Float pr = sc.nextFloat(); 
   
     System.out.println("Enter Rate");
    Float rate = sc.nextFloat(); 
   
     System.out.println("Enter Time");
    Float time = sc.nextFloat(); 
   
    Float SI = (pr*rate*time)/100;
    System.out.println(SI);
 }  
 
 }   

