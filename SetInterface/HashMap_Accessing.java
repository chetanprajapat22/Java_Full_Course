package in.co.SetInterface;

import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Accessing {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<Integer,String>();

        chm.put(100,"Geeks");
        chm.put(101,"for");
        chm.put(102,"Geeks");
        chm.put(103,"contribute");

        System.out.println("the mapping are: " );
        System.out.println(chm);

        System.out.println("the value associated to" + "100 is: " + chm.get(100));

        System.out.println("the value associated to " + " 103 is: " + chm.get(103));
    }
}
