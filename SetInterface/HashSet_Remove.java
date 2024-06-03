package in.co.SetInterface;

import java.util.HashSet;

public class HashSet_Remove {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Geek");
        set.add("for");
        set.add("Geeks");
        set.add("A");
        set.add("B");
        set.add("z");

        System.out.println("Initial Hashset : " + set);

        set.remove("B");
        System.out.println("After removimg elements: " + set);
    }
}
