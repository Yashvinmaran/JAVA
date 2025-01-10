import java.util.*;
public class FindMaximum {
   public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
      }
      int small = arr[0];
      for (int i = 0; i<size; i++){
            if(small<arr[i]){
                  small = arr[i];
            }
      }
      System.out.println("The Maximum element is :"+small);
   }   
}
