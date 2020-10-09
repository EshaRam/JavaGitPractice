package Loops;

public class swap {
    public static void third(int a, int b){

        int c;

        c=a;
        a=b;
        b=c;

        System.out.println(a+","+b);

    }


    public static void main(String[] args) {
        third(5,3);
    }
}
