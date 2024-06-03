package in.co.Collection_List.Collection;

import java.util.ArrayList;

public class Array_ListIterating {
    public static void main(String[] args) {

        ArrayList<String > a1 = new ArrayList<String>();

        a1.add("Geeks");
        a1.add(1,"for");
        a1.add("Geeks");

        for (int i= 0 ; i< a1.size();i++){
            System.out.print(a1.get(i) + " ");
        }
        System.out.println(" ");
        for (String str: a1){
            System.out.print(str + " ");
        }
    }

}
