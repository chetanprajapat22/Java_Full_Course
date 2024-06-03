package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Accessing {
    public static void main(String[] args) {

        Deque<String> dq= new ArrayDeque<>();

        dq.add("welocme");
        dq.add("to ");
        dq.add("the");
        dq.add("Geeks");
        dq.add("4");
        dq.add("Geeks");

        System.out.println("Array deque: " + dq);
        System.out.println("The first element is: " + dq.getFirst());
        System.out.println("the last element is: " + dq.getLast());
    }
}
