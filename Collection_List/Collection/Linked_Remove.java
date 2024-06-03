package in.co.Collection_List.Collection;

import java.util.LinkedList;

public class Linked_Remove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("Geeks");
        list.add(1,"For");
        System.out.println("Initial linkedlist: " + list);
        list.removeLast();
        System.out.println("After the index Removal: " + list);
        list.remove(1);
        System.out.println("After the removal index: " + list);
    }
}
