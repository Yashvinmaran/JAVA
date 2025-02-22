//HCF
/*import java.util.Scanner;
public class LCM_HCF {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number-1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();

        int num;
        int HCF = 0;

        num = (num1>num2)?num2:num1;

        for (int i = 1; i<num; i++){
            if(num1%i == 0 && num2%i == 0){
                HCF = i;
            }
        }
        System.out.print("The HCF is "+num1+" and "+num2+" is :"+HCF+"\n");

        //LCM
        int LCM = ((num1*num2)/HCF);
        System.out.print("The HCF is "+num1+" and "+num2+" is :"+LCM+"\n");
    }
}*/


//LCM
/*import java.util.Scanner;
public class LCM_HCF {
    public static void main(String []Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Number :");
        int num2 = sc.nextInt();

        int num, ans;
        if (num1 > num2){
            num = num1;
        }else{
            num = num2;
        }
        for (int i =num; ;i++){
            if(i%num1 == 0 && i%num2 == 0){
                ans = i;
                break;
            }
        }
        System.out.print("The LCM is :"+ans+"\n");
    }
}*/

