package in.co.QueueCollection;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Queue_AddConcurrent {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();

        queue.add("Kolkata");
        queue.add("Patna");
        queue.add("Delhi");
        queue.add("jammu");
        queue.add("Banglore");

        System.out.println("ConcurrentLinkedQueue:  " + queue);

        ArrayList<String> arrayList  = new ArrayList<String>();

        arrayList.add("Sanjeet");
        arrayList.add("Rabi");
        arrayList.add("Debasis");
        arrayList.add("Raunank");
        arrayList.add("Mahesh");
        System.out.println("Collection to be added: " + arrayList);

        boolean response = queue.addAll(arrayList);
        System.out.println("collection added: " + response);
        System.out.println("concurrentLinkedlistQueue: " + queue);
    }
}
