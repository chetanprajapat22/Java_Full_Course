package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Remove {
    public static void main(String[] args) {

        Deque<String> dq= new ArrayDeque<String>();

        dq.add("one");
        dq.addFirst("two");
        dq.addLast("three");
        System.out.println("ArrayDeque: " + dq);
        System.out.println(dq.pop());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
}
