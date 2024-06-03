package in.co.Threads;

import javax.swing.plaf.PanelUI;

public class RacingCondThread extends Thread {
    public static account_01 data = new account_01();

    String name = null;

    public RacingCondThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i=0;i<5;i++){
            data.deposit(name,1000);
        }
    }
}
