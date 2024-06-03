package in.co.polymorphismusingreturn;


public class shape {
    public shape(){

    }
    public  double area(){
     return  0;
    }
    public static  shape getshape(int i){
        if(i==1){
            return new Rectangle(5,6);
        }
        if(i==2){
            return new Circle(4);
        }
        if(i==3){
            return  new Triangle(10,30);
        }
        return new shape();
    }
}
