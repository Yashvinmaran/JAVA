import java.util.Scanner;
public class HDFC_service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choise for-product press (1) & for-service press (2) :");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.println("Product choice for-CarInsurance press-(1), HomeInsurance press-(2), HealthInsurance press-(3)");
            ch = sc.nextInt();

            if(ch == 1){
                System.out.println("CarInsurance Details:");
            }else if(ch == 2){
                System.out.println("Homes Detailed:");
            }else if(ch == 3){
                System.out.println("HealthInsurance Details:");
            }else{
                System.out.println("Invalid choice");
            }
        }else if(ch == 2){
            System.out.println("No service Available:");
        }else{
            System.out.println("Invalid choice");
        }
    }
}