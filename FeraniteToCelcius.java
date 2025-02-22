import java.util.Scanner;

public class FeraniteToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit or DegreeCelcius :");
        int temp = sc.nextInt();
        System.out.print(
                "Enter the choice for Deegre-celcius to Fahrenheit (press-1) and Fahrenheit to Degree-celcius (press-2):");
        int ch = sc.nextInt();

        if (ch == 1) {
            double celcius = (temp - 32) * 5.0 / 9;
            System.out.println(temp + " Degree Fahrenheit is equal to " + celcius + " Degree-celcius");
        } else if (ch == 2) {
            double fahrenheit = (temp * 9.0 / 5) + 32;
            System.out.println(temp + " Degree Celcius is equal to " + fahrenheit + " Fahrenite");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
