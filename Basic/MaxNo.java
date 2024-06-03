package in.co.Basic;

public class MaxNo {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        int c=4;
        if(a>b) {
        if(a>c){
            System.out.println(" a is greater than c" + a);
        } else {
            System.out.println("b is greater than c" + c);
        }
        }else {
            if (b>c){
                System.out.println("print b " + b);
            }else {
                System.out.println("print c" + c);
            }
        }
    }
}
