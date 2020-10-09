package ArraysAndStrings;

public class Reverse {

    static String method(String s){
       String  reverse ="";
        char ch[]= s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){

            reverse = reverse + ch[i];
        }
        return reverse;
    }
    static void method1(String s){

        StringBuffer sb = new StringBuffer(s);

        System.out.println(sb.reverse());


    }

    public static void main(String[] args) {
       String word = Reverse.method("esha");
        System.out.println(word);
        method1("Anu");
    }
}
