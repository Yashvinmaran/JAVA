import java.util.Scanner;
public class SeriesMidPoint {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number :");
        int n2 = sc.nextInt();
        System.out.print("Enter third Number :");
        int n3 = sc.nextInt();
        System.out.print("Enter fourth Number :");
        int n4 = sc.nextInt();
        
        System.out.println("The mid is :" + ((n2+n3)/2));
    }
}
