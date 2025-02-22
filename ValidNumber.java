import java.util.Scanner;
public class ValidNumber {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number from (1 to 9):");
        int num = sc.nextInt();

        if (num < 1 || num > 9) {
            System.out.println("Invalid number!!");
        } else {
            System.out.println("Enter the next number:");
            int prevNum = num;
            num = sc.nextInt();
            if (num == prevNum - 1 || num == prevNum + 1) {
                System.out.println("Invalid Number");
            } else {
                prevNum = num;
                System.out.println("Enter next number");
                num = sc.nextInt();
                if (num == prevNum - 1 || num == prevNum + 1) {
                    System.out.println("Invalid Number");
                } else {
                    prevNum = num;
                    System.out.println("Enter next number");
                    num = sc.nextInt();
                    if (num == prevNum - 1 || num == prevNum + 1) {
                        System.out.println("Invalid Number");
                    } else {
                        prevNum = num;
                        System.out.println("Enter next number");
                        num = sc.nextInt();
                        if (num == prevNum - 1 || num == prevNum + 1) {
                            System.out.println("Invalid Number");
                        } else {
                            prevNum = num;
                            System.out.println("Enter next number");
                            num = sc.nextInt();
                            if (num == prevNum - 1 || num == prevNum + 1) {
                                System.out.println("Invalid Number");
                            } else {
                                prevNum = num;
                                System.out.println("Enter next number");
                                num = sc.nextInt();
                                if (num == prevNum - 1 || num == prevNum + 1) {
                                    System.out.println("Invalid Number");
                                } else {
                                    prevNum = num;
                                    System.out.println("Enter next number");
                                    num = sc.nextInt();
                                    if (num == prevNum - 1 || num == prevNum + 1) {
                                        System.out.println("Invalid Number");
                                    } else {
                                        prevNum = num;
                                        System.out.println("Enter next number");
                                        num = sc.nextInt();
                                        if (num == prevNum - 1 || num == prevNum + 1) {
                                            System.out.println("Invalid Number");
                                        } else {
                                            System.out.println("You reached your destiny");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
