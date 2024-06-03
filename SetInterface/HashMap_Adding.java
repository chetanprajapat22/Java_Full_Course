package in.co.SetInterface;

import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Adding {
    public static void main(String[] args) {

        ConcurrentHashMap<String,String > chm = new ConcurrentHashMap<String,String>();
        chm.put("1","1");
        chm.put("2","1");
        chm.put("3","1");
        chm.put("4","1");
        chm.put("5","1");
        chm.put("6","1");

        System.out.println("Mapping of chm: " + chm);
        ConcurrentHashMap<String,String> new_chm = new ConcurrentHashMap<>();
        new_chm.putAll(chm);
        System.out.println("New mappings are " + new_chm);
    }
}
