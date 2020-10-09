package Loops;

public class Fibonacci {

    public static void fibo(){

        int a=0;
        int b=1;
        int c;

        for(int i=0;i<10;i++){
            System.out.println(a);
            c = a+b;
            a=b;
            b=c;

        }

    }

    public static void main(String[] args) {
        fibo();
    }
}
