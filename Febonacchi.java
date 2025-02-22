import java.util.Scanner;
public class Febonacchi {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term of the series :");
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int temp;
        System.out.println(0 + "-> "+n1);
        if (num >= 1){
            System.out.println(1 + "-> "+n2);
        }
        for (int i = 2; i<num; i++){
            temp = (n1+n2);
            n1 = n2;
            n2 = temp;
            
            System.out.println(i + "-> "+temp);
            
        }
    }
}
