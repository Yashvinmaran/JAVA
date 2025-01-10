import java.util.Scanner;

public class Input{
    public static void main(String []Args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number :");
      int a = input.nextInt();
      System.out.println("The number is :"+a);
      System.out.print("Enter the first number :");
      int b = input.nextInt();
      System.out.println("The number is :"+b);
      System.out.println("The sum of "+a+" and "+b+" is :"+(a+b));
    }
}