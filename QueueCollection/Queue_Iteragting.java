package in.co.QueueCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Iteragting {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
