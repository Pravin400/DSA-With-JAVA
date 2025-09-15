package LinkedList.LL_Operations;

public class LL_Recursive_Search {
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

    public static void printlist(){
        Node temp = head;
//        System.out.println("The head is : "+head.data);
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static int IterativeSearch(int data){
        if(size == 0){
            System.out.println("List is empty. Search failed.");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (data == temp.data) {
                return i + 1;  // 1-based position
            }
            temp = temp.next;
        }
        return -1;
    }
    public static int helper(Node head,int data){
        if(head == null){
            return -1;
        }
        if(head.data == data){
            return 0;
        }
        int idx = helper(head.next, data);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }
    public static int RecursiveSearch(int data){
        return helper(head,data);
    }

    public static void main(String[] args) {
        LL_Recursive_Search ll = new LL_Recursive_Search();

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

        // Search example
        int searchKey = 311;
        int position = ll.RecursiveSearch(searchKey);
        if (position > 0) {
            System.out.println("Element " + searchKey + " found at position " + (position+1)+" And At Index : "+position);
        } else {
            System.out.println("Element " + searchKey + " not found in the list.");
        }
    }
}
