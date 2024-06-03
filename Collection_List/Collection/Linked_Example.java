package in.co.Collection_List.Collection;

import java.util.LinkedList;

public class Linked_Example {
    public static void main(String[] args) {

        LinkedList<String > list= new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.addLast("c");
        list.addFirst("d");
        list.add(2,"E");
        System.out.println(list);

        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
