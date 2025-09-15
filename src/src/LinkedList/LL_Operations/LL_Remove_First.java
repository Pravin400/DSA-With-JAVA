package LinkedList.LL_Operations;

public class LL_Remove_First {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void add(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static int removeFirst(){
        if(size  == 0){
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail =null;
            System.out.println("Now the The List is empty");
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static void printlist(){
        Node temp = head;
//        System.out.println("The head is : "+head.data);
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL_Remove_First ll = new LL_Remove_First();
        printlist();
        System.out.println("Size Of the  LL is : "+ll.size);
        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.add(4);

        printlist();
        System.out.println("Size Of the  LL is : "+ll.size);
        System.out.println();
        System.out.println("Removing the First Element......"+ll.removeFirst()+"st Element Removed");
        System.out.println("Size Of the  LL is : "+ll.size);

        printlist();
    }
}
