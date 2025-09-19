package LinkedList.LL_Operations;

//{1,2,3,2,1}
public class LL_Palindrome {
    //this are use to identify mid
//slow/turtle pointer is +1 iteratate untill hare/fast is null
//hare/fast pointer is +2
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

    public Node midnode(Node head) {
        Node slow = head;
        Node fast  = head;
        while (fast.next != null && fast != null){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
        }
        System.out.println("slow"+slow.data);
        return slow;
    }

    public  boolean isPalindrome() {
        if(head == null || head.next == null){//linkedlist is either empty or having one element
            return true;
        }
        //1.find mid
        Node mid = midnode(head);
        //2.reverse mid
        Node prev = null;
        Node curr = mid;
        Node next ;
        //3.reverse 2nd half
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //if right and left part comparision
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        LL_Palindrome ll = new LL_Palindrome();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        ll.printList();
        System.out.println("is this palindrome : " + ll.isPalindrome());

    }

}
