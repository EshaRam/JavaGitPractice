package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
        Student su = new Student(3,"Esha");
        Student su1 = new Student(4,"Esha");
        System.out.println(su.toString());


        if(su.getName().equals(su1)){
            System.out.println("both objects are same");
        }
        else System.out.println("both objects are not equal");

        if(su.getName().hashCode()==su1.getName().hashCode()){
            System.out.println("both have same hashcode value");
        }
        else System.out.println("both have different hashcode value");
    }
}
