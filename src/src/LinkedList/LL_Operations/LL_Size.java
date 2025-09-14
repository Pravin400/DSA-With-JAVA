package LinkedList.LL_Operations;

public class LL_Size {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void print(){
        System.out.println("Size of Linked List :  "+size);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void addMiddle(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;
        Node temp=head;
        System.out.println(head.data);
        int i=0;
        while (i < idx-1){
            temp=temp.next;
            i++;

        }
        newNode.next=temp.next;
        System.out.println(newNode.next.data);
        temp.next=newNode;
        System.out.println(temp.next.data);
    }

    public static void main(String[] args) {
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(50);
        print();
        addMiddle(40,0);
        print();
    }
}
