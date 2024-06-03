package in.co.Collection_List.Collection;

import java.util.LinkedList;

public class Linked_Changing {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("Chetan");
        list.add("Prajapat");
        System.out.println("Initial linkedList: " + list);
        list.set(0,"I" + "am");
        System.out.println("Updated linkedlist:  " + list);
    }
}
