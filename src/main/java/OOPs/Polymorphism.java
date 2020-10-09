package OOPs;
//Write a program to depict the behavior of method overloading and overriding.

class Grandparents{
    public void gp(){
        System.out.println("Muthu");
    }
}


public class Polymorphism extends Grandparents{
    public void gp(){
        System.out.println("Vishnu is grandchild");
    }

    public  int ex(int a, int b){

        return a+b;
    }
    public int ex(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        Grandparents g = new Polymorphism();
        g.gp();
       // int result = Polymorphism.ex(2,4,6);
        //System.out.println(result);
        Polymorphism p = new Polymorphism();
        int result = p.ex(3,2);
        System.out.println(result);

    }
}
