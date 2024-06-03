package in.co.oop;

public class oops {
    String color;
    String Type;

   public void info(){
       System.out.println(this.color);
       System.out.println(this.Type);
    }

    public static void main(String[] args) {
        oops  obj = new oops();
        obj.color = "blue";
        obj.Type = "gel";

        obj.info();


    }
}