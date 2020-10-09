package ArraysAndStrings;
//Write a program to find a substring in a given string and then replace it with another string.

public class Substring {

    public static void check(String s){

        String s1 = s.replace("good","nice");
        System.out.println(s1);

    }

    public static void main(String[] args) {
        check("Have a good day");
    }
}
