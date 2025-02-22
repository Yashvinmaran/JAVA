/*import java.util.Scanner;
public class Switch_in_Java {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of to choose the value :");
        int num = sc.nextInt();
        String output;

        // switch (num) {
        //     case 1:System.out.println("Case-1");
        //     break;
        //     case 2:System.out.println("Case-2");
        //     break;
        //     case 3:System.out.println("Case-3");
        //     break;
        //     case 4:System.out.println("Case-4");
        //     break;
        //     default:System.out.println("Invalid choice");
        // }



        // output = switch (num) {
        //     case 1->("Case-1");
        //     case 2->("Case-2");
        //     case 3->("Case-3");
        //     case 4->("Case-4");
        //     default->("Invalid choice");
        // };


        
        /*output = switch (num) {
            case 1->{"Case-1"}
            case 2->{"Case-2"}
            case 3->{"Case-3"}
            case 4->{"Case-4"}
            default->{"Invalid choice"}
        };
        System.out.println(output);*/




import java.util.Scanner;
public class Main{
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first case :");
        int c = sc.nextInt();
        
        switch(c){
            case 1->{
                System.out.println("Welcome to case 1 and enter the another case :");
                c = sc.nextInt();
                switch(c){
                    case 1->{
                        System.out.println("Welcome to case 1 of case 1and enter the another case :");
                    }
                    default->{
                        System.out.println("invalid");
                    }
                }
            }
            default -> {
                System.out.println("Invalid");
            }
        }
    }
}
