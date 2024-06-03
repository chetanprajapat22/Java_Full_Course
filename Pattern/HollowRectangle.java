package in.co.Pattern;

public class HollowRectangle {

    public static void hollo_Rectangle(int R ,int C){
        for (int i=1;i<=R;i++){
            for (int j=1;j<=C;j++){
                 if(i==1|| i==R || j==1||j==C){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollo_Rectangle(4,5);

    }

}
