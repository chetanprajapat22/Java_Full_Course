package in.co.Threads;

public class HelloRunnable implements Runnable {

    String name = null;

    public  HelloRunnable(String n){
        name = n;

    }
    @Override
    public void run() {

        for (int i=0;i<=5;i++){
            System.out.println(i+name);
        }

    }
}
