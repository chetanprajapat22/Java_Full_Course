package in.co.Abstraction;

public abstract class Shape1 {
    String color;
    abstract double area();
    public abstract String toString();

    public Shape1(String color){
        System.out.println("shape constructor called");
        this.color = color;
    }
    public String getColor(){
        return color;
    }


}
