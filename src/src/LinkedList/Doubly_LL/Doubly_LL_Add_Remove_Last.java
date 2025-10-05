package LinkedList.Doubly_LL;

public class Doubly_LL_Add_Remove_Last {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data) {
        Node newNode = new Node(data);

        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        }

    //Last

    public void addLast(int data) {
        Node newNode = new Node(data);

        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = tail;
        tail.prev = newNode;
        tail = newNode;

    }
    //print

    public void print() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.print("null  ");
    }

    //remove fast

    public int removeFirst() {
        if(head==null){
            System.out.println("the list is empty");
            return -1;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size --;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Doubly_LL_Add_Remove_Last dll = new Doubly_LL_Add_Remove_Last();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.print();
        System.out.println("\nsize="+size);
        dll.removeFirst();
        dll.print();
        System.out.println("\nsize="+size);dll.removeFirst();
        dll.print();
        System.out.println("\nsize="+size);

    }
}
