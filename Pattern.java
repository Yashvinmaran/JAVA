/*import java.util.Scanner;
public class Pattern {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j >= i && j <= n-i){    // (j>=(n+1)-i) //(i<=j)  // (i<=(n+1)-n)  // (i>=j)   //(j<=(n+1)-i) //(j>=(n+1)-i &&  j<=4+n) //(j>=(n+1)-i &&  j<=4+n)
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/


import java.util.Scanner;
public class Pattern {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the Rows :");
        int row = sc.nextInt();

        for (int i = 1; i <= (row * 2 - 1); i++){
            for (int j = 1; j <= (row*2 - 1); j++){
                if (j < row/2-1 + )
            }
        }
    }
}