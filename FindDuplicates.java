import java.util.*;
public class FindDuplicates {
      public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            sc.close();

            int arr[] = new int [size];
            boolean flag = true;

            System.out.println("Enter the array element :");
            for (int i= 0; i<size; i++){
                  arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element what want to find in array :");
            int element = sc.nextInt();
            for(int i = 0; i<size; i++){
                  if(arr[i] == element){
                      flag = true; 
                      break; 
                  }else{
                        flag = false;
                  }
            }
            if(flag){
                  System.out.println("The array element is found");
            }else{
                  System.out.println("The array element is not found");
            }
      }
}
