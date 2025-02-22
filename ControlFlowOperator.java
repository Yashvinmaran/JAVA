/*import java.util.Scanner;
public class ControlFlowOperator {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are Eligible for Vote");
        }else{
            System.out.println("You are not Eligible for Vote");
        }
    }
}*/

/*import java.util.Scanner;
public class ControlFlowOperator {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side :");
        int s1 = sc.nextInt();
        System.out.print("Enter second side :");
        int s2 = sc.nextInt();
        System.out.print("Enter third side :");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("Equlateral triangle");
        }else{
            System.out.println("Not a Equilateral triangle");
        }
    }
}*/


/*import java.util.Scanner;
public class ControlFlowOperator {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first result for (head - 1 and tale - 2):");
        int r1 = sc.nextInt();
        System.out.print("Enter second result for (head - 1 and tale - 2):");
        int r2 = sc.nextInt();
        System.out.print("Enter third result for (head - 1 and tale - 2):");
        int r3 = sc.nextInt();

        if(((r1 == 1 || r1 == 2) && (r2 == 1 || r2 == 2)) && (r3 == 1 && r3 == 2)){
            if((r1 == 1 && r2 == 1)&&(r3 == 2)){
                System.out.println("Yes");
            }else if((r1 == 2 && r2 == 1)&&(r3 == 1)){
                System.out.println("Yes");
            }else if((r1 == 1 && r2 == 2)&&(r3 == 1)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}*/


/*import java.util.Scanner;
public class ControlFlowOperator {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        if((num % 3 == 0 && num % 6 == 0) && (num % 9 == 0 && num % 10 != 0)){
            System.out.println("Number is divisible by 3,6,9 and not 10");
        }else{
            System.out.println("Number is not divisible by 3,6,9 and not 10");
        }
    }
}*/


import java.util.Scanner;
public class ControlFlowOperator {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter third number :");
        int num3 = sc.nextInt();

        // System.out.println(num1+""+ num2 + num3);
        if(num1 > 0){
            System.out.print(num1);
        }
        System.out.print(num2);
        System.out.print(num3);
    }
}



