import java.util.Scanner;
public class ReverseNumber {
    public static void main(String []Args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
    int rev = 0;
    while (num !=0 ){
        rev = rev * 10;
        rev += num%10;
        num/=10;
    }
    System.out.println("The Rev number is :"+rev);
    }
}
