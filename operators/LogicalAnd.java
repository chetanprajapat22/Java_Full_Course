package in.co.operators;

public class LogicalAnd {
    public static void main(String[] args) {
        int a =24;
        int b = 24;
        if(a==b && b==a){
            System.out.println("true");
        }else
            System.out.println((3>2)&& (5>2));
    }
}
