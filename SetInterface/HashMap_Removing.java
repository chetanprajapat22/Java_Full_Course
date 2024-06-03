package in.co.SetInterface;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Removing {
    public static void main(String[] args) {

        ConcurrentHashMap<String, String> hm =  new ConcurrentHashMap<String,String>();


        hm.put("1","1");
        hm.put("2","2");
        hm.put("3","3");
        hm.put("4","4");
        hm.put("5","5");
        System.out.println( "Map "+  hm);
        System.out.println(" ");

        String valueRemoved = hm.remove("4");

        System.out.println("After removing mapping with key 4: ");
        System.out.println("Map: " + hm);
        System.out.println("Value removed: " + valueRemoved);
        System.out.println();
    }
}
