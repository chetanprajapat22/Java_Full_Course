package in.co.Collection_List.Collection;

import java.util.Vector;

public class Vector_Removing {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("for geeks");
        v.add(4);

        v.remove(1);
        System.out.println("after removal : " + v);
    }
}
