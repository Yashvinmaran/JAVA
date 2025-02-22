import java.util.Scanner;
public class palindrom {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is :");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0){
            rev *= 10;
            rev += temp%10;
            temp/=10;
        }
        // System.out.println("The rev number is :"+rev);
        if (num == rev){
            System.out.println("The Number is Palindrome");
        }else{
            System.out.println("The number is not Palindrome");
        }
    }

}
