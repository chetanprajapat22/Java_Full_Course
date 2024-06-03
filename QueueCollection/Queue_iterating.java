package in.co.QueueCollection;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue_iterating {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>();

        q.add(166);
        q.add(246);
        q.add(66);
        q.add(292);
        q.add(98);

        Iterator<Integer>it = q.iterator();
        System.out.println("the linkedBlockingQueue " );
        for (int i=0 ; i<q.size();i++){
            System.out.println(it.next() + " ");
        }
    }
}
