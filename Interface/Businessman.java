package in.co.Interface;

public class Businessman implements Richman,Socialworker{
    @Override
    public void earnmoney() {
        System.out.println("earn money");
    }

    @Override
    public void donationmoney() {

        System.out.println("donation money");
    }

    @Override
    public void party() {
        System.out.println("doing party");

    }

    @Override
    public void helptoother() {
        System.out.println("help to other");

    }
    public void New(){
        System.out.println("I am Businessman");
    }
}
