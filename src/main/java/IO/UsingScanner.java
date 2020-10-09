package IO;


import java.util.Scanner;

public class UsingScanner {

    public static int scanEx(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        System.out.println("Enter another number");
        int input2 = scanner.nextInt();
        return input+input2;
    }

    public static void main(String[] args) {
        int result = scanEx();
        System.out.println(result);


    }
}
