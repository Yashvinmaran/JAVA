/*import java.util.Scanner;
public class Addition{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter the first number :");
        a=sc.nextInt();
        System.out.println("Enter the second number :");
        b=sc.nextInt();

        System.out.println(a+b);
    }
}*/

// WAP TO DESIGN A CALCULATOR addition multipication subtraction divide and modulas

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c,r=0;
        System.out.println("Enter the first number :");
        a=sc.nextInt();
        System.out.println("Enter the second number :");
        b=sc.nextInt();

        System.out.println("Enter any operation for Addition-1, Multiplication-2, Substraction-3, Divide-4, and Modulas-5 :");
        c=sc.nextInt();

        switch(c){
            case 1:
            r=a+b;
            System.out.print(r);
            break;

            case 2:
            r=a*b;
            System.out.print(r);
            break;

            case 3:
            r=a-b;
            System.out.print(r);
            break;

            case 4:
            r=a/b;
            System.out.print(r);
            break;
            
            case 5:
            r=a%b;
            System.out.print(r);
            break;

            default:
            System.out.print("Invalid choice");
        }
    }
}