package in.co.Basic;

import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        int n=4;
        Random random = new Random();
       for (int i=1 ;i<=n;i++){
           int randomNumber = random.nextInt(100);
           System.out.println( randomNumber);

       }


    }
}