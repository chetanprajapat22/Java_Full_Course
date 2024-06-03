package in.co.Excercise;

public class MinofTwo {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        int c=4;
        if(a<b) {
            if(a<c){
                System.out.println(" a is Smaller than c: " + a);
            } else {
                System.out.println("b is Smaller than c: " + c);
            }
        }else {
            if (b<c){
                System.out.println("print b: " + b);
            }else {
                System.out.println("print c:  " + c);
            }
        }
    }
}
