/*import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Enter the nth term :");
        n = sc.nextInt();

        /*for (int i=1;i<=n;i++){
            System.out.println(i+"\n");
        }
        System.out.println("The reverse formade is :");
        for(int j=n;j>=1;j--){
            System.out.println(j+"\n");
        }

        for (int r=1;r<=n;r++){
            for (int c=1;c<=n;c++){
                if((r>1 && r<n) && (c>1 && c<n))
                {
                System.out.print("   ");
            }else{
                System.out.print(" * ");
            }
            }System.out.print("\n");
        }
    }
}*/

/*public class Example{
    public static void main(String[] args){
        int arr[]={23,21,56,78,5,6,90,12,34,78};
        
        for (int i=0;i<=9;i++){
            System.out.println(arr[i]);
        }
    }
}*/

/*public class arrayexample2{
    public static void main(String[] args){
        int []arr = {123,456,434,4544,454,3432,23323,33,34,454,7667,555};
        for (int i:arr){
            System.out.println(i);
        }
    }
}*/
/*import java.util.Scanner;
public class Arrayexample3{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value of index "+i+":");
            arr[i]=sc.nextInt();
        } 
        for(int i:arr){
            System.out.println(i);
        }
    }
}*/

//WAP to create array it store the integer value and double value

import java.util.Scanner;
public class ARRAYS {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of first array :");
    int size1 = sc.nextInt();
    System.out.print("Enter the size of second array :");
    int size2 = sc.nextInt();

    int[] arr1 = new int[size1];
    double[] arr2 = new double[size2];
    for(int i=0; i<size1; i++){
        System.out.print("Enter the value of index "+i+" of array 1 :");
        arr1[i]=sc.nextInt();
    } 
     for(int j=0; j<size2; j++){
            System.out.print("Enter the value of index "+j+" of array 2 :");
            arr2[j]=sc.nextDouble();
        }
        for(int i:arr1){
            System.out.println(i);
        }
        for(Double j:arr2){
            System.out.println(j);
        }
    }
}

//WAP a program to reverse a first half of an array and keep the second half aseteas without creating new array