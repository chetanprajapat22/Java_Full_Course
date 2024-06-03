package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class DQueue_Array {
    public static void main(String[] args) {

        Deque<Integer>deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);

        int first = deque.removeFirst();
        int last = deque.removeLast();

        System.out.println("First: " + first + ", Last: " + last);
    }
}
