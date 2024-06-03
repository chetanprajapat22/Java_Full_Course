package in.co.QueueCollection;

import java.util.PriorityQueue;

public class Queue_Remove {
    public static void main(String[] args) {

        PriorityQueue<String> pq= new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("for");
        pq.add("Geeks");
        System.out.println("Intial PriorityQueue " + pq);

        pq.remove("Geeks");

        System.out.println("After remove:  " + pq);

        System.out.println("poll Method: " + pq.poll());

        System.out.println("Final PriorityQueue : " + pq);
    }
}
