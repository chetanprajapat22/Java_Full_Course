package in.co.QueueCollection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue_Adding {
    public static void main(String[] args) throws IllegalStateException {
        BlockingQueue<Integer> BQ= new LinkedBlockingQueue<Integer>();

        BQ.add(7855642);
        BQ.add(35658786);
        BQ.add(5278367);
        BQ.add(74381793);
        System.out.println("Blocking Queue: " + BQ);

    }
}
