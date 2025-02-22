import java.util.Scanner;
public class Coin {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first result (Head=1 && Tale=2) :");
        int c1 =sc.nextInt();
        System.out.println("Enter second result (Head=1 && Tale=2) :");
        int c2 = sc.nextInt();
        System.out.println("Enter third result (Head=1 && Tale=2) :");
        int c3 = sc.nextInt();

        String s = ((c1 == 1 || c1 == 2) && (c2 == 1 || c2 == 2) && (c3 == 1 || c3 == 2))?((c1 == 1) && (c2 == 1) && (c3 == 2))?"Yes":((c1 == 2) && (c2 == 1) && (c3 == 1))?"yes":((c1 == 1) && (c2 == 2) && (c3 == 1))?"yes":"no":"Invalid input";
        System.out.println(s);
    }
}
