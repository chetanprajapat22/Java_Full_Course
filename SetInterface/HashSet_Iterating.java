package in.co.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterating {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String >();

        set.add("chetan ");
        set.add("Prajapat ");
        set.add("Pipalkota ");
        set.add("Dewas");

        Iterator itr =  set.iterator();

        System.out.println("the iterator value are: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
