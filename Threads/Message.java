package in.co.Threads;

public class Message implements Runnable {

    public void run(){
        System.out.println("Dispalying important message task");
        for (int i=0;i<3;i++){
            System.out.println("focus is important to master skill");
        }
        System.out.println("*****************************************");
    }
}
