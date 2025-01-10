/*import java.util.Scanner;
public class radius {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.print("Enter the radius of the circle :");
        r=sc.nextFloat();
        
        float pi=3.14f;

        System.out.println("The area of circle is :");
        System.out.println(pi*r*r);
        System.out.println("The perameter of circle is :");
        System.out.println(2*pi*r);
    }
}
*/

/*import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int c;
        float l,w,h,b,s;
        System.out.println("Enter the choice for Area of rectangle-1, Area of square-2, Area of triangle-3 :");
        c = sc.nextInt();

        switch(c){
            case 1:{
                System.out.println("Enter the length of the rectangle :");
                l=sc.nextFloat();
                System.out.println("Enter the width of the rectangle :");
                w=sc.nextFloat();
                System.out.println("The Area of the rectangle :");
                System.out.println(l*w);
                break;  
            }
            case 2:
            System.out.println("Enter the side of the square :");
            s=sc.nextFloat();
            System.out.println("The area of square is :");
            System.out.println(s*s);
            break;
        
        case 3:
        System.out.println("Enter the base of the triangle :");
        b=sc.nextFloat();
        System.out.println("Enter the height of the triangle :");
        h=sc.nextFloat();
        System.out.println("The area of the triangle is :");
        System.out.println(0.5*h*b);
        break;

        default:
        System.out.println("Invalid choice please choose valid choice");
        }
    }
}*/

/*import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n, sum1 = 0, sum2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the n term:");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        
        System.out.println("The sum of even numbers is: " + sum1);
        System.out.println("The sum of odd numbers is: " + sum2);
        
        sc.close();
    }
}*/

import java.util.Scanner;

public static void main(String[] args){
    int a,b,c,d,e;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the five number :");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();

    if((a>b && a>c && a>d && a<e) || (a>b && a>c && a<d && a>e) ||(a>b && a<c && a>d && a>e) ){
        System.out.println("The Second largest number is :" +a);
    }else if(a>b && a>c && a<d && a>e){
        
    }
}


