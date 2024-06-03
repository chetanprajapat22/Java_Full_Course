package in.co.Collection_List.Collection;

import java.util.LinkedList;

public class Linked_Add {
    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<String>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add(0,"Hello");
        System.out.println(list);
    }
}
