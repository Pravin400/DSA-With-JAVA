package LinkedList.Linked_List_Crud;

public class LinkedListPrint {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        //new node creation
        Node newNode = new Node(data);
        //when node is empty
        if(head==null){
            head= tail = newNode;
            return;
        }
        //2 new node assign to the head
        newNode.next=head;//newnode stores the address of the next head
        //3 head = newNode
        head=newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head = tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void printlist(){

        Node temp = head;//we store the head value in the temp because we not able to change the head
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;

        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListPrint obj = new LinkedListPrint();
        printlist();
        addFirst(1);
        printlist();
        addFirst(2);
        printlist();
        addFirst(3);
        printlist();
        addLast(4);
        printlist();
        addLast(5);
        printlist();
    }
}
