package in.co.QueueCollection;

import java.util.PriorityQueue;

public class Queue_Priority {
    public static void main(String[] args) {

        PriorityQueue<Integer>pqueue = new PriorityQueue<Integer>();

        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(30);
        pqueue.add(60);

        System.out.println(pqueue);

        System.out.println(pqueue.peek());

        System.out.println(pqueue.poll());

        System.out.println(pqueue.peek());

    }
}
