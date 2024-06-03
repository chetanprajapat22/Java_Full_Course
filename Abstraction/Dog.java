package in.co.Abstraction;

public class Dog  extends Animal{
    private String color;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String Bark() {
        return null;
    }

}
