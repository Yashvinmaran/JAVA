import java.util.Scanner;
public class Path {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path");
        int path = sc.nextInt();

        if (path == 1){
            System.out.println("You are at the start of the path please enter next location.");
            path = sc.nextInt();

            if(path == 2){
                System.out.println("Enter next location");
                path = sc.nextInt();
                if(path == 3){
                    System.out.println("Enter next location");
                    path = sc.nextInt();
                    if(path == 4){
                        System.out.println("You have reached the end of the path");
                    }
                }else if(path == 4){
                    System.out.println("you have reached end of the path");
                }else{
                    System.out.println("Invalid location");
                }
            }else if(path == 3){
                System.out.println("Enter next location");
                path = sc.nextInt();
                if(path == 4){
                    System.out.println("You have reached the end of the path");
                }else{
                    System.out.println("Invalid location");
                }

            }else if(path == 4){
                System.out.println("You have reached the end of the path");
            }else{
                System.out.println("Invalid path");
            }
        }else{
            System.out.println("Wrong path");
        }
    }
}
