package in.co.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dqueue_Example {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<Integer>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        for(Integer element : dq){
            System.out.println("Element : " + element);
        }
        System.out.println("Using clear () ");
        dq.clear();

        dq.addFirst(564);
        dq.addFirst(291);

        dq.addLast(24);
        dq.addLast(14);

        System.out.println("Above elements are removed now");

        System.out.println("Elements of deque using iterator: ");

        for (Iterator it = dq.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        System.out.println("\n Head element using element (): "+  dq.element());
        System.out.println("\n Head Element using get first(): " + dq.getFirst());
        System.out.println("\n Head Element using last element(): " + dq.getLast());

        Object [ ] arr =    dq.toArray(new Integer[0]);
        System.out.println("\n Array size:  "+ arr.length );

        System.out.println("Array element: ");

        for(int i=0 ; i< arr.length;i++){
            System.out.println(" " + arr[i]);
        }
        System.out.println("\n Head element:" + dq.peek());

        System.out.println("|n head element poll : " + dq.poll());


        dq.push(265);
        dq.push(983);
        dq.push(2365);
        System.out.println("Head element remove : " + dq.remove());

        System.out.println("the final array is: " + dq);
    }
}
