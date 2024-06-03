package in.co.Collection_List.Collection;

import java.util.ArrayList;

public class Array_ListRemove {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<String>();

        str.add ("Chetan");
        str.add("Prajapat");
        str.add("from");
        str.add("pipalkota");
        System.out.println("Initial ArrayList: " + str);

        str.remove(2);
        System.out.println("After the index Removal : " + str);

        str.remove("pipalkota");
        System.out.println("after the remove object:  " + str);

    }
}
