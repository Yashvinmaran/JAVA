import java.util.Scanner;
public class Loops {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the Nth term of the number :");
        int n = sc.nextInt();
        long sum = 0;
        long i = 1;
        do{
            sum = sum+i;
            i++;
        }
        while(i <= n);
        System.out.print("The sum of all Nth number is :"+sum+"\n");
    }
}
