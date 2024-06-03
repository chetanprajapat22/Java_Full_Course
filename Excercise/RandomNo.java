package in.co.Excercise;

import java.util.Random;

public class RandomNo {
    public static void main(String[] args) {
        int n =4;
        Random random = new Random();
        for (int i=1 ;i<=n;i++){
            int randomNumber = random.nextInt(100);
            System.out.println(  " Random number are: " + randomNumber);

        }

    }
}
