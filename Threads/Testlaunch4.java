package in.co.Threads;

public class Testlaunch4 {
    public static void main(String[] args) {
        calc c1 =new calc();
        Message m2 = new Message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);


        t1.start();
        t2.start();
      }
}
