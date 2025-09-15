package LinkedList.LL_Operations;

public class LL_Find_Remove_FromEnd {
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


    public static void printlist(){
        Node temp = head;
//        System.out.println("The head is : "+head.data);
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void Removen(int index){

        if(index == size){
            head = head.next;//removef irst/head
            size--;
            return;
        }


        int iToFind = size-index;//size = 5 ,index = 3 iToFind = 2 is a for iterating till the previoud
        Node prev =head;
        for(int i = 1;i < iToFind ;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;


    }

    public static void main(String[] args) {
        LL_Find_Remove_FromEnd ll = new LL_Find_Remove_FromEnd();

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

        // remove element
        System.out.println("\n=== After removing nth Elements ===");
        int removeindex = 4;
        ll.Removen(removeindex);
        ll.printlist();
        System.out.println("Size: " + size);

    }
}
