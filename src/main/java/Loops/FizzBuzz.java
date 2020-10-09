package Loops;

public class FizzBuzz {

    public static void test(int num){
        if(num%3==0 && num%5==0){
            System.out.println(num + " Fizzbuzz");
        }

        else if (num%3==0){
            System.out.println("fizz");
        }
        else if(num%5==0){
            System.out.println("buzz");
        }
        else
        {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        test(30);
    }
}
