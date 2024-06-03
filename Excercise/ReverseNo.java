package in.co.Excercise;

public class ReverseNo {
    public static void main(String[] args) {
//        int n = 12804;
//        while (n>0){
//            int lastdigit  = n%10;
//            System.out.print(lastdigit+ " ");
//            n= n/10;
//        }
//        System.out.println(" ");

        int n = 12804;
        int rev = 0 ;

        while (n>0) {
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.println("reverse : " + rev);
    }
}
