package in.co.SetInterface;

import java.util.HashSet;

public class HashSet_add {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Geek");
        hs.add("for");
        hs.add("Geeks");

        System.out.println("Hashset elements: " + hs);
    }
}
