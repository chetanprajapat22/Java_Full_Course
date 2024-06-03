package in.co.Collection_List.Collection;

import java.util.LinkedList;

public class Linked_Iterating {
    public static void main(String[] args) {
        LinkedList <String >list = new LinkedList<>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        for(int i=0 ;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println(" ");
        for(String str : list){
            System.out.print(str);
        }
    }
}
