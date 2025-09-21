 package LinkedList.LL_Operations.LL_Loop_Cycle;


public class LL_Remove_Loop_Cycle {


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

    public static boolean isCycle() {
        Node slow = head;
        Node fast  = head;
        while (fast != null && fast.next != null  ){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if (slow == fast){
                return true;//cycle exists
            }
        }
        return false;//cycle not exists

    }

    public static void RemoveCycle() {
        Node slow = head;
        Node fast  = head;
        boolean hasCycle = false;
        //detection of cycle
        while (fast != null && fast.next != null  ){
        slow = slow.next;//+1
        fast = fast.next.next;//+2
            if (slow == fast){
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle){
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev =fast;
            slow = slow.next;
            fast = fast.next;
        }
        // If cycle starts at head, find last node in the loop
        if (prev == null) {
            prev = fast;
            while (prev.next != slow) {
                prev = prev.next;
            }
        }

        //Break the loop
        prev.next = null;
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
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
//        printList(); // 1->2->3->4->1 loop cycle
        System.out.println("LL Cycle Detected : " + isCycle());
        RemoveCycle();
        System.out.print("LL Cycle Removed : ");
        printList();
        System.out.println("LL Cycle Detected : " + isCycle());

    }

}
