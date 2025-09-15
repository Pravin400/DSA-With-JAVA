package LinkedList.LL_Operations;

public class LL_Remove_Last {
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

    public static int removeLast(){
        if(size  == 0){
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            System.out.println("Element Removed Successfully");
            System.out.println("Now the The List is empty");
            size = 0;
            return val;
        }
            Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
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
        LL_Remove_Last ll = new LL_Remove_Last();
        printlist();
        System.out.println("Size Of the  LL is : "+ll.size);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        printlist();
        System.out.println("Size Of the  LL is : "+ll.size);
        System.out.println("Removing the Last  Element......");
        ll.removeLast();
        printlist();

        System.out.println("Size Of the  LL is : "+ll.size);
        System.out.println("Removing the Last  Element......");
        ll.removeLast();
        printlist();

        System.out.println("Size Of the  LL is : "+ll.siz e);
        System.out.println("Removing the Last  Element......");
        ll.removeLast();
        printlist();

        System.out.println("Size Of the  LL is : "+ll.size);

        printlist();
    }
}
