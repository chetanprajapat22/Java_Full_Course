package in.co.Collection_List.Collection;

import java.util.Vector;

public class Vector_Iterating {
    public static void main(String[] args) {

        Vector<String > v = new Vector<String>();
        v.add("Geeks");
        v.add("Geeks");
        v.add(1,"for");
        for (int i=0;i< v.size();i++){
            System.out.print(v.get(i)+ " ");
        }
        System.out.println(" ");
        for (String str: v)
            System.out.print(str + " ");
    }
}
