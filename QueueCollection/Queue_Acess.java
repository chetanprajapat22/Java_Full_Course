package in.co.QueueCollection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue_Acess {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new LinkedBlockingQueue<Integer>();

        bq.add(22);
        bq.add(125);
        bq.add(723);
        bq.add(172);
        bq.add(100);
        System.out.println("the linkedBlockinqQueue ,bq contains: " );
        System.out.println(bq);
        if(bq.contains(22)){
            System.out.println("the linkedBlockinqQueue ,bq contains 22: ");
        }else {
            System.out.println("no such element exists");
        }
        int head = bq.element();
        System.out.println("the head of bq: " + head);
    }
}
