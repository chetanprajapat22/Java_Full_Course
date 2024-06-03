package in.co.Threads;

public class TestHelloRunnable {

    public static void main(String[] args) {

        Thread f1 =new Thread(new HelloRunnable("Ram"));
        Thread f2 =new Thread(new HelloRunnable("sita"));

        f1.start();
        f2.start();

        for (int i=0;i<500;i++){
            System.out.println("Main");
        }
    }
}
