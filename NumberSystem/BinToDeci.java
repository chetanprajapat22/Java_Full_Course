package in.co.NumberSystem;

public class BinToDeci {

    public static void binToDec(int n){
        int mynumber= n;
        int pow =0;
        int decNum = 0;

        while ((n>0)){
            int lastDigit = n%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2,pow));

            pow++;
            n= n/10;
        }
        System.out.println("decimal of"+ mynumber + " = "+decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
