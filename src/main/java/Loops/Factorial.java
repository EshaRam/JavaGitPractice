package Loops;

public class Factorial {

    static void nonrecur(int num){

       int sum =1;

       for(int i=num;i>=1;i--){
           sum = sum*i;
       }
        System.out.println("factorial of given number is "+ sum);

    }
    static int recur(int num){
        if(num ==1)
            return 1;
        else {
            return(num * recur(num -1));
        }

    }

    public static void main(String[] args) {
        nonrecur(3);
        int factorial = Factorial.recur(4);
        System.out.println("factorial of given number by recursion is "+factorial);
    }
}
