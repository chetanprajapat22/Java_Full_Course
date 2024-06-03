package in.co.Collection_List.Collection;

import java.util.Vector;

public class Vector_Update {
    public static void main(String[] args) {

//        Vector<Integer> v= new Vector<Integer>();
//        v.add(12);
//        v.add(23);
//        v.add(22);
//        v.add(10);
//        v.add(20);
//
//        System.out.println("Vector : " + v);
//
//        System.out.println("the object that is replaced is: " + v.set(1,21));
//        System.out.println("the object that is replaced is: " + v.set(4,50));
//        System.out.println("the new verctor is: " + v);
        Vector<String> str = new Vector<String>();

        str.add("chetan");
        str.add("vishal");
        str.add("nirmal");
        str.add("pankaj");
        System.out.println("the object that is replaced is: " + str.set(3,"sonu"));
        System.out.println("the new vector is: " + str);

    }
}
