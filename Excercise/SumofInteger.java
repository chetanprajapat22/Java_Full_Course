package in.co.Excercise;

public class SumofInteger {
    public static void main(String[] args) {
        int sum =0;
        for (int i=100;i<=200;i++){
            if (i%7 == 0){
                sum +=i;
                System.out.println("divisible by 7: " + i);
//                System.out.println("the sum are: " + sum );
            }
        }

    }
}
