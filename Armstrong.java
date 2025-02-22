import java.util.Scanner;
public class Armstrong {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int c = 0;

        while (num != 0 ){
            c++;
            num = num/10;
        }
        int digit;
        int sum = 0;
        while (num != 0){
            digit = num%10;
            for (int i = 1; i<c; i++){
                digit *= digit;
            }
            sum += digit;
            num = num/10;
        }
        if(sum == num){
            System.out.print("Yes\n");
        }else{
            System.out.print("No\n");
        }
    }
}
