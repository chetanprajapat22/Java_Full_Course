package in.co.Threads;

import static java.lang.Thread.*;

public class Priority extends HelloRunnable {

    public Priority(String n) {
        super(n);
    }

    public static void main(String[] args) {
        Thread t =new Thread("Ram");
        t.setPriority(9);
        int j = t.getPriority();

//        MIN_PRIORITY =1;
//        MAX_PRIORITY =10;
//        NORM_PRIORITY= 5;
        for (int  i=0;i<=50;i++){
            System.out.println("main");
        }
        System.out.println(t);
    }
}
