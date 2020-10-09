package OOPs;

public class AbstractEx {

    public static void main(String[] args) {
        Shape c = new Circle();
        c.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}
class Circle extends Shape{
    public void draw() {
        System.out.println("CircleEX!");
    }
}


