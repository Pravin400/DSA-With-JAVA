package Java_Collection_Frameworks.List.LinkedList.MergeSorting;

public class LL_Merge_Sort {


    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    private static Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergedLL.next;    }

    public static Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
//        find mid
        Node mid = getMid(head);

//  left & right merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight =  mergeSort(rightHead);
            //cycle not exists
        return merge(newLeft,newRight);
    }


    public static void printList() {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL_Merge_Sort list = new LL_Merge_Sort();
        list.addNode(5);
        list.addNode(1);
        list.addNode(8);
        list.addNode(2);
        list.addNode(4);
        list.addNode(6);
        list.addNode(7);
        list.addNode(3);
        System.out.print("Unsorted LL : ");
        printList();
        list.head = list.mergeSort(list.head);
        System.out.print("\nSorted LL : ");
        printList();
    }

}