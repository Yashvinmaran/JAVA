import java.util.Scanner;

public class AsianPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first color :");
        String col1 = sc.nextLine();
        System.out.println("Enter the second color :");
        String col2 = sc.nextLine();

        String result = col1+col2;

        /*if(result == ("redblack")){
            System.out.println("Red Black");
        }else{
            System.out.println("Wrong inputs");
        }*/  // This output is wrong because it is comparing the string with the object or memoryLocation;

        /*if(result.equals("redblack")){
            System.out.println("Red Black");
        }else{
            System.out.println("Wrong inputs");
        }*/

        /*if(col1 == col2){
            System.out.println("Red Black");
        }else{
            System.out.println("Wrong inputs");
        }*/ // This output is also wrong because it is comparing the string with the object or memoryLocation;
    }
}