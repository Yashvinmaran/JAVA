import java.util.Scanner;
public class Equlateral {
    public static void main(String []Args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first size of the triangle :");
    int s1 = sc.nextInt();
    System.out.print("Enter the Second size of the triangle :");
    int s2 = sc.nextInt();
    System.out.print("Enter the third size of the triangle :");
    int s3 = sc.nextInt();

    String s = ((s1 == s2) && (s2 == s3))?"Equlateral":"Not equlateral";
    System.out.println(s);
    }
}
