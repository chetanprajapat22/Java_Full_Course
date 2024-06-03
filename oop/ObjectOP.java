package in.co.oop;

public class ObjectOP {

    public static void main(String[] args) {

        Pen p1  =new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
    }

}
class Pen {
    String color;
    int tip;

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }
}
class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage = (phy+chem+math)/3;
    }

    public void setName(String name) {
        this.name = name;
    }
}
