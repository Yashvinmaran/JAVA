import java.util.Scanner;
public class CheckDivisibleBy {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();

        String s = (num%2 == 0 && num%4 == 0) && (num%6 == 0 && num%8 != 0)?"The Number is divisible by 2,4,6 and not by 8":"The Number is not divisible by 2,4,6";
        System.out.println(s);
    }
}
