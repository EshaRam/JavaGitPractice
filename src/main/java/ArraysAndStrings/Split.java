package ArraysAndStrings;
//Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".

public class Split {

    public  void substring(String s){

        int count =1;

        String[] s1 = s.split(" ");
        for(String s2: s1){
            System.out.print(s2 + count++ +" ");

        }
    }

    public static void main(String[] args) {
       // substring("Have a good day");
        Split sub = new Split();
        sub.substring("This is good");



    }

}
