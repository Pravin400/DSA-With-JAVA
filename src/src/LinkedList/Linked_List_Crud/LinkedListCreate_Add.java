package LinkedList.Linked_List_Crud;

public class LinkedListCreate_Add {
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
            System.out.println(head.data);
            System.out.println(tail.data);
            return;
        }
        //2 new node assign to the head
        newNode.next=head;//newnode stores the address of the next head
        //3 head = newNode
        head=newNode;
        System.out.println(newNode.data);
        System.out.println(newNode.next.data);
        System.out.println(head.data);
        System.out.println(tail.data);
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head = tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        System.out.println(newNode.data);
        System.out.println(tail.data);

        System.out.println(head.data);
        System.out.println(tail.data);
    }
    public static void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListCreate_Add ll = new LinkedListCreate_Add();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        printlist();
    }
}
