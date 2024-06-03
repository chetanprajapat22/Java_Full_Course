package in.co.Interface;

public class rectangle implements shape{
    int length ;
    int width;
    rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println("Rectangle has been draw");
    }

    @Override
    public double area() {
        return (double) (length*width);
    }
}
