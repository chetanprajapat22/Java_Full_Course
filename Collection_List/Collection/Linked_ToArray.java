package in.co.Collection_List.Collection;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Linked_ToArray {
    public static void main(String[] args) {
        LinkedList<Integer> list =  new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        System.out.println("Linkedlist: " + list);
        Object[] a = list.toArray();
        System.out.print("After converted Linkedlist to array: " );
        for (Object element : a){
            System.out.print(element + " ");
        }
    }
}
