package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_Iterator {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.add("for");

        dq.addFirst("Geeks");

        dq.addLast("Geeks");
        dq.addLast("is so good");

        for (Iterator it = dq.iterator(); it.hasNext();){
            System.out.println(it.next()+ " ");
        }
    }
}
