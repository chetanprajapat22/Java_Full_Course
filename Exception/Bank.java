package in.co.Exception;

public class Bank {

    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposite(double amount){
        balance += amount;
    }
    public double withdraw (double amount ) throws BankException {

        if(balance<2000){

            throw new BankException("Balance Can't be less than 2000");
        }
        if(amount>balance){
            throw new BankException("Insufficient balance " + "your wuthdraw amount is more than balance");
        }
        balance -= amount;
        return balance;
    }
}
