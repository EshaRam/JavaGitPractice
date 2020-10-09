package OOPs;
//Write a program creating an inteface ShapeConstants with variable(pi=3.14).

interface Ex{
    double pi = 3.14;

}

class Area implements Ex{
    public void calc(int r){
        double measurement = pi*r*r;
        System.out.println(measurement);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        Area a = new Area();
        a.calc(3);





    }
}
