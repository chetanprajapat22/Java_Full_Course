package in.co.Threads;

public class TestHelloThread  {

    public static void main(String[] args) {



            HelloThread h1 = new HelloThread("Ram");
            HelloThread h2 = new HelloThread("Shyam");

            h1.start();
            h2.run();

            for (int i = 0; i < 50; i++) {
                System.out.println("main");
            }
        }
    }

