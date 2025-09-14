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
            return;
        }
        //2 new node assign to the head
        newNode.next=head;//newnode stores the address of the next head
        //3 head = newNode
        head=newNode;
    }

    public static void addLast(int data){

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
        LinkedListCreate_Add obj = new LinkedListCreate_Add();
        addFirst(1);
        addFirst(2);
        addFirst(3);
        printlist();
    }
}
