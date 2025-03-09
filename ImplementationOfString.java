/* //String is a class or non-premitive data type and array of character

import java.util.Scanner;
public class ImplementationOfString {
    public static void main(String[] args) {
        // String obj = "mausam";
        // String obj = new String("mausam");

        char ch[] = {'m','a','u','s','a','m'};

        // System.out.println(ch);

        String obj = new String(ch);
        for (char i : ch){
            System.out.print(i);
        }
    }
}*/

/*import java.util.Scanner;
public class ImplementationOfString{

    class point{
        public
        int num;
        point value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String obj1 = "orange";
        String obj2 = new String("apple");
        String obj3 = "orange";
        String obj4 = "apple";
        String obj5 = new String("Banana");

        System.out.println(obj1 == obj3);
        System.out.println(obj2 == obj4);
        System.err.println(obj5.intern());


    }
}*/

/*public class ImplementationOfString {

    public static void main(String[] args) {
        String str1 = "12345";

        // str = str.replace("apple","orange");
        // System.out.println(str);

        int i = 0;
        int j = str1.length()-1;
        char []str = str1.toCharArray();
        /*while(i < j){
           char s = str.charAt(i);
            str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1);
            str = str.substring(0, j) + s + str.substring(j + 1);
            i++;
            j--;
        }

        

        /*i = 0;
        j = str.length()-1;
        String newstr = "";
       
        
        while(i < j){
            char s = str[i];
            str[i] = str[j];
            str[j] = s;
            i++;
            j--;
        }

        System.out.println(str);
    }
}*/

// import java.util.Scanner;
// public class ImplementationOfString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string :");
//         String str = sc.nextLine();
//         char []c = str.toCharArray();
//         int i = 0;
//         int j = str.length()-1;
//         while(i < j){
//             char temp;
//             temp = c[i];
//             c[i] = c[j];
//             c[j] = temp;
//             i++;
//             j--;
//         }
//         System.out.println(c);
//     }
// }

/*import java.util.Scanner;
public class ImplementationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string :");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string :");
        String s2 = sc.nextLine();

        int[] c = new int[256];
        if(s1.length() != s2.length()){
            System.out.println("Given strings is not anagram");
        }else{
            int i = 0;
            while(i < s1.length()){
                c[s1.charAt(i)]++;
                c[s2.charAt(i)]--;
                i++;
            }
        }
        for (int n : c){
            if(n != 0){
                System.out.println("Given strings is not anagram");
                return;
            }
        }
        System.out.println("Given strings is Valid Anagram");
        sc.close();
    }
}*/

// import java.util.Scanner;
// public class ImplementationOfString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string :");
//         String ChangeInUpper = sc.nextLine();
//         char[] arr = ChangeInUpper.toCharArray();
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] >= 'a' && arr[i] <= 'z'){
//                 arr[i] = (char)(arr[i] - 32);
//             }else if (arr[i] >= 'A' && arr[i] <= 'Z'){
//                 arr[i] = (char) (arr[i] + 32);
//             }
//         }
//         System.out.printf("The Upper is %s",arr);
//     }
// }


//Here this question solved by broteforce approach
/*import java.util.Scanner;
public class ImplementationOfString {
    static boolean check(String s1, String s2){
        int n = s1.length();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<=i; j++){
                String sub = s1.substring(i,j);
                if(s2.contains(sub)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string :");
        String s1 = sc.nextLine();
        System.out.print("Enter the sub string of the string :");
        String s2 = sc.nextLine();

        if(check(s1,s2)){
            System.out.println("The given string is substring of first string");
        }else{
            System.out.println("The given string is Not substring of first string");
        }
        sc.close();
    }
}*/



//This code is using by the help of 
//Here same question substring solve by sliding window approach
/*import java.util.*;
public class ImplementationOfString {
    static boolean check(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
    
        if (m > n) return false;
    
        for (int i = 0; i <= n - m; i++) {
            if (s1.regionMatches(i, s2, 0, m)) { 
                return true; 
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string :");
        String s1 = sc.nextLine();
        System.out.print("Enter the sub string of the string :");
        String s2 = sc.nextLine();

        if(check(s1,s2)){
            System.out.println("The given string is substring of first string");
        }else{
            System.out.println("The given string is Not substring of first string");
        }
        sc.close();
    }
}*/

//By using fully optimise approach
import java.util.Scanner;
public class ImplementationOfString {
    static boolean check(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (n > m) return false;

        int j = 0;
        for (int i = 0; i < m; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
                if (j == n-1) {
                    return true;
                }
            } else {
                j = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the substring: ");
        String s2 = sc.nextLine();

        if (check(s1, s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
