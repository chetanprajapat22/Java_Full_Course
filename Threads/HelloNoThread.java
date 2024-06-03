package in.co.Threads;

public class HelloNoThread {
//    public static void main(String[] args) {
        String name =null;

        public HelloNoThread(String n){
            name = n;
        }
        public void run(){
            for (int i=0;i<=50;i++){
                System.out.println(i+name);
            }
        }
    }

