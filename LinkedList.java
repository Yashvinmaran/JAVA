public class LinkedList {
    public class Node{
        
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    int size = 0;
    void insertAtEnd(int num){
        Node temp = new Node(num);
        if(head == null){
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
        size++;
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
        size++;
    }

    void insertAt(int num, int idx){
        if(idx > size || idx < 0){
            System.out.println("Invalid indexing");
            return;
        }else if(idx == 0){
            insertAtHead(num);
            return;
        }else if(idx == size){
            insertAtEnd(num);
            return;
        }else{
            Node add = new Node(num);
            Node temp = head;
            for (int i = 1; i<idx; i++){
                temp = temp.next;
            }
            add.next = temp.next;
            temp.next = add;
        }
        size++;
    }

    void delete(int idx){
        Node temp = head;
        if(idx == 1){
            head = head.next;
            size--;
            return;
        }else if(idx == size){
            while(temp.next != null){
                temp = temp.next;
            }
            tail = temp;
                temp = null;
        }
        else{
            for(int i = 1 ; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       ll.insertAtEnd(4) ;
       ll.insertAtEnd(5);
       ll.insertAtEnd(6);
       ll.insertAtHead(3);
       ll.insertAtHead(2);
       ll.insertAtHead(1);
       ll.insertAt(12, 2);
       ll.display();
    }
}