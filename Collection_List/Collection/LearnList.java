package in.co.Collection_List.Collection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
//        list<String> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(54);
        list.add(70);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.remove(5);
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
    }
}
