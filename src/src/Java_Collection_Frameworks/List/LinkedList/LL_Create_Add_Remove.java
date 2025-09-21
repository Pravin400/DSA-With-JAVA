package Java_Collection_Frameworks.List.LinkedList;

import java.util.LinkedList;

public class LL_Create_Add_Remove  {
    public static void main(String[] args) {
        //cretae
        LinkedList <Integer> list = new LinkedList <>();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        System.out.println("List 1 "+ list);
        LinkedList <Integer> list1 = new LinkedList <>();
        list1.addLast(0);
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        System.out.println("List 2 "+list1);
        LinkedList <Integer> list2 = new LinkedList <>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println("List 3 "+list2);

        LinkedList <Integer> list3 = new LinkedList <>();
        list3.addAll(list2);
        System.out.println("List 4 "+list3);

        list3.remove(0);
        System.out.println("from list 3 remove at index 0 the list is : "+list3);
        list3.removeLast();
        System.out.println("from list 3 removelast the list is : "+list3);
        list3.removeFirst();
        System.out.println("from list 3 removefirst the list is : "+list3);
    }
}
