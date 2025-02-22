/*import java.util.Scanner;
public class Ternary {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :");
        int a = sc.nextInt();
        System.out.print("Enter the Second number :");
        int b = sc.nextInt();
        System.out.print("Enter the third number :");
        int c = sc.nextInt();
        String result = a>b && a>c?"The first number is greater":b>c && b>a?"Second number is greater":c>a && c>b?"Third number is greater":a == b && b == c?"All numbers are equal":"two number are equal";
        System.out.println(result);
    }
}*/


//Password
import java.util.Scanner;
public class PasswordCheckByTernary {
    public static void main(String[] args) {
        int pswd = 12345;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password : ");
        String password = sc.next();

        
        ((pswd == password) ? "Open" : "Password mismached Try again :"((pswd = sc.NextInt()) == password) ? "open" : "password Mismached try again :"((pswd = sc.NextInt()) == password) ? "Open" : "Not open");
    }
}