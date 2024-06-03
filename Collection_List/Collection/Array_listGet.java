package in.co.Collection_List.Collection;

import java.util.ArrayList;

public class Array_listGet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(9);
        list.add(5);
        list.add(6);
        list.add(99);
        list.add(55);
        System.out.println(list);
        Integer n= list.get(3);
        System.out.println("at index 3 number is:  " + n);
    }
}
