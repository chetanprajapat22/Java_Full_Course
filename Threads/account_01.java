package in.co.Threads;

public class account_01 {

    private int balance = 0;

    public int getBalance() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
        }
        return balance;
    }
    public void setBalance(int balance) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        this.balance = balance;
    }public   synchronized void deposit(String msg,int amt){
        int bal = getBalance();
        bal = bal+ amt;
        setBalance(bal);
        System.out.println(msg + " new balance " + bal);
    }
}
