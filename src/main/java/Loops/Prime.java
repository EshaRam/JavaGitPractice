package Loops;

public class Prime {

    static int check(int num){
        int i=2;
        while(i<num) {

            if (num % i == 0) {
                System.out.println(num +" is not prime");
                break;
            }
            i++;

            if(i==num){
                System.out.println(num + " is prime");
            }
        }
        return i;
    }

    static int checkPrime(int num){

        int i=2;

        for(i=2;i<num;i++){
            if(num % i==0){
                System.out.println(num + " is not prime");
                break;
            }
            else
                System.out.println(num + " is prime");
            break;
        }

       return i;
    }

    public static void main(String[] args) {
        check(7);
        checkPrime(21);
    }
}
