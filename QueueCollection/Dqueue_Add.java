package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class Dqueue_Add {
    public static void main(String[] args) {

        Deque<String >  dq= new ArrayDeque<String>();

        dq.add("the");
        dq.addFirst("to");
        dq.addLast("Geeks");

        dq.offer("for");
        dq.offerFirst("welcome");
        dq.offerLast("Geeks");
        System.out.println("Array deque: " + dq);
    }
}
