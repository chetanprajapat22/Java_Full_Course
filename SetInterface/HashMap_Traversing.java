package in.co.SetInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Traversing {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<Integer,String>();

        chm.put(1,"first");
        chm.put(2,"second");
        chm.put(3,"third");
        chm.put(4,"four");
        System.out.println("the map are: " + chm);

        Iterator <Map.Entry<Integer,String>> itr = chm.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }
}
