package OOPs;


/*Write a program that creates a class Circle extending
Shape abstract class and implementing ShapeConstants interface and has following behavior
--> Properties: radius.
--> Constructor: To set number of sides.
--> Overrides all the methods from parents.
 */
interface ShapeConstants{
    double pi = 3.14;

}

abstract class Shape1{
    int r;

    public abstract void area();

    public Shape1(int r){
        this.r=r;
    }
   }



public class CircleEX extends Shape1 implements ShapeConstants{
    public CircleEX(int r) {
        super(r);
    }

    public static void main(String[] args) {
        Shape1 shape1= new CircleEX(3);
        shape1.area();

    }


    @Override
    public void area() {
        double result = pi*r*r;
        System.out.println(result);
    }
}
