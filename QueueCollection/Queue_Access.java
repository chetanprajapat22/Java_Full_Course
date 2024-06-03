package in.co.QueueCollection;

import java.util.PriorityQueue;

public class Queue_Access {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);

        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
