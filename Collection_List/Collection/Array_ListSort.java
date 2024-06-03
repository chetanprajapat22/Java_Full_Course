package in.co.Collection_List.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_ListSort {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(3);
//        list.add(7);
//        list.add(5);
//        list.add(1);
//        list.add(0);
//        System.out.println("Before sorting list: ");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println("after sorting list:  ");
//        System.out.println(list);
        ArrayList<Character> c= new ArrayList<Character>();
         c.add('c');
         c.add('h');
         c.add('e');
         c.add('t');
         c.add('a');
         c.add('n');
        System.out.println("Before sorting: " + c);
        Collections.sort(c);
        System.out.println("After sorting: " + c);
    }
}
