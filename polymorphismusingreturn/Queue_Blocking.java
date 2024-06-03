package in.co.polymorphismusingreturn;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue_Blocking {
    public static void main(String[] args)
       throws InterruptedException{

        int capacity = 5;

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);


        queue.put("Starwars");
        queue.put("Superman");
        queue.put("Flash");
        queue.put("Batman");
        queue.put("Avengers");
        System.out.println("Queue contains " + queue);

        queue.remove();
        queue.remove();
        System.out.println("Queue contains: " + queue);
    }
}
