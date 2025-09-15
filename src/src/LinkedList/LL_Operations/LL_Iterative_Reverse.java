package LinkedList.LL_Operations;

public class LL_Iterative_Reverse {
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
            System.out.println("Element Removed Successfully");
            System.out.println("Now the The List is empty");
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
            System.out.println("Element Removed Successfully");
        size--;
        return val;

    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        LL_Iterative_Reverse ll = new LL_Iterative_Reverse();

        System.out.println("=== Initial List ===");
        ll.printlist();
        System.out.println("Size: " + size);

        // Add some elements
        ll.add(11);
        ll.add(12);
        ll.add(31);
        ll.add(14);

        System.out.println("\n=== After Adding Elements ===");
        ll.printlist();
        System.out.println("Size: " + size);
        System.out.println("\n=== After Reversing Elements ===");
        ll.reverse();
        ll.printlist();
        System.out.println("Size: " + size);

    }
}
