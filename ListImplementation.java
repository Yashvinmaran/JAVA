// import java.util.Scanner;

// public class ListImplementation {
//     public class Node{
//         int value;
//         Node next;
//         Node(int value){
//             this.value = value;
//             this.next = null;
//         }
//     }
//         public class LinkedList{
//             Node head = null;
//             Node tail  = null;
//             int length = 0;
//             void insertAtEnd(int num){
//                 Node temp = new Node(num);
//                 if(head == null){
//                     head = temp;
//                 }else{
//                     tail.next = temp;
//                 }
//                 tail = temp;
//                 length++;
//             }
//             void insertAtHead(int num) {
//                 Node temp = new Node(num);
//                 if (head == null) {
//                     head = temp;
//                     tail = temp;
//                 } else {
//                     temp.next = head;
//                     head = temp;
//                 }
//                 length++;
//             }

//             void insertAtIndex(int index, int num){
//                 Node add = new Node(num);
//                 Node temp = head;
//                 if(index == length){  // or size
//                     insertAtEnd(num);
//                     return;
//                 }else if(index == 0){
//                     insertAtHead(num);
//                     return;
//                 }else if(index < 0 || index > length){   //or size()
//                     System.out.println("Wrong indexing");
//                     return;
//                 }
//                 for (int i = 1; i<index; i++){
//                     temp = temp.next;
//                 }
//                 add.next = temp.next;
//                 temp.next = add;
//                 length++;
//             }

//             // int size(){
//             //     // Node temp = head;
//             //     // int c = 0;
//             //     // while(temp != null){
//             //     //     c++;
//             //     //     temp = temp.next;
//             //     // }

//             //     return length;
//             // }


//             int getAt(int index){
//                 if(index < 0 || index > length){
//                     System.out.println("Wrong indexing");
//                     return -1;
//                 }
//                 Node temp = head;
//                 for (int i = 1; i<=index; i++){
//                     temp = temp.next;
//                 }
//                 return temp.value;
//             }

//             void deleteAt(int index){
//                 Node temp = head;
//                 if(index == 0){
//                     head = head.next;
//                     length--;
//                     return;
//                 }else if(index == length - 1){
//                     tail = temp;
//                     length --;
//                     return;
//                 }
//                 if(index > length || index < 0){
//                     System.out.println("Wrong index");
//                     return;
//                 }
//                 for (int i = 1; i<index; i++){
//                     temp = temp.next;
//                 }
//                 temp.next = temp.next.next;
//                 length--;
//             }
//             void display(){
//                 Node temp = head;
//                 while(temp != null){
//                     System.out.print(temp.value + " -> ");
//                     temp = temp.next;
//                 }
//                 System.out.println("null");
//             }
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ListImplementation l = new ListImplementation();
//         LinkedList ll = l.new LinkedList();
//         ll.insertAtHead(0);
//         ll.insertAtHead(100);
//         ll.insertAtHead(200);
//         ll.insertAtEnd(1);
//         ll.insertAtEnd(2);
//         ll.insertAtEnd(3);
//         ll.insertAtEnd(4);
//         ll.insertAtEnd(5);
//         ll.insertAtIndex(8, 500);
//         ll.insertAtIndex(0, 400);


//         System.out.println("Before delete list :");
//         ll.display();


//         System.out.println(ll.getAt(3));
//         System.out.println(ll.getAt(6));

//         System.out.println("After delete list :");
//         ll.deleteAt(5);
//         ll.deleteAt(0);
//         ll.deleteAt(9);

//         ll.display();

//         System.out.println("The head is :"+ll.head.value);
//         System.out.println("The tail is "+ll.tail.value);

//         System.out.println("The size of the List is :"+ll.length);
//         sc.close();
//     }
// }







import java.util.Scanner;
public class ListImplementation {
    class Node{
           int value;
           Node next;
           Node(int value){
            this.value = value;
            this.next = null;
           } 
        }
    public class LinkedList{
        Node head = null;
        Node tail = null;
        int length = 0;

        void insertAtEnd(int num){
            Node temp = new Node(num);
            if (head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            length++;
        }

        void insertAtHead(int num){
            Node temp = new Node(num);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            length++;
        }

        void insertAtIndex(int index, int num){
            Node add = new Node(num);
            Node temp = head;
            if(index > length || index < 0){
                System.out.println("Invalid Indexing");
                return;
            }
            if(head == null){
                insertAtEnd(num);
                return;
            }
            if(index == 0){
                insertAtHead(num);
                return;
            }else if(index == length){
                insertAtEnd(num);
                return;
            }else{
                for (int i = 1; i<index; i++){
                    temp = temp.next;
                }
                add.next = temp.next;
                temp.next = add;
            }
            length++;
        }

        void deleteAt(int index){
            Node temp = head;
            if(index >= length || index < 0){
                System.out.println("Invalid Indexing");
                return;
            }
            if(index == 0){
                head = head.next;
            }else if(index == length-1){
                for (int i = 1; i<index; i++){
                    temp = temp.next;
                }
                tail = temp;
            }else{
                for (int i = 1; i<index; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            length--;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ListImplementation l = new ListImplementation();
        LinkedList ll = l.new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(1);

        ll.insertAtIndex(0, 0);
        ll.insertAtIndex(6, 6);

        ll.deleteAt(0);

        ll.display();
        System.out.println("The length of the list is :"+ll.length);
        System.out.println("The Head of the list is :"+ll.head.value);
        System.out.println("The Tail of the list is :"+ll.tail.value);
    }
}