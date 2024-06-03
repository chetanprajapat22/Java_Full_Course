package in.co.Collection_List.Collection;

import java.util.ArrayList;

public class Array_ListChangimg {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<String>();

        str.add("Geeks");
        str.add("Geeks");

        str.add(1,"Geeks");

        System.out.println("initial ArrayList " + str);

        str.set(1,"for");
        System.out.println("Updated Arraylist " + str);

    }
}
