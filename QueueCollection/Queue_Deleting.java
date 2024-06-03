package in.co.QueueCollection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue_Deleting {
    public static void main(String[] args) {

        BlockingQueue<Integer> q= new LinkedBlockingQueue<Integer>();
        q.add(75);
        q.add(86);
        q.add(13);
        q.add(44);
        q.add(10);

        System.out.println("the linkedBlockingQueue: ");
        System.out.println(q);

        q.remove(86);
        q.remove(44);
        System.out.println("\n the LinkedBlockingDeque ,Q contains");
        System.out.println(q);
    }
}
