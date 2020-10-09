package ArraysAndStrings;

public class Palindrome {

    static void check(String s){

        String reverse ="";

        char ch[] = s.toCharArray();

        for(int i=s.length()-1;i>=0;i--){
            reverse = reverse + ch[i];
        }
        if(s.equalsIgnoreCase(reverse)){
            System.out.println(s+ " is palindrome");
        }
        else System.out.println("not a palindrome");
    }
    public static void checkNumber(int num){

        int r,sum =0,temp;

        temp=num;
        while (num>0){
            r=num%10;//getting remainder
            System.out.println("remainder"+r);
            sum = (sum*10)+r; // reversing the number
            System.out.println("sum"+sum);
            num=num/10;// cutting down the number one by one
            System.out.println("number after cut"+num);
        }
        if (temp==sum){
            System.out.println("given number is palindrome");
        }
        else System.out.println("not a palindrome");

    }

    public static void main(String[] args) {

        check("level");
        checkNumber(16461);
    }

}
