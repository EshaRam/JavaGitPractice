package IO;
//BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.

import java.io.*;

public class BufferedEx {




    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter a number");
        String sub = br.readLine();
        InputStreamReader ir1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(ir1);
        System.out.println("Enter another number");
        String sub1 = br1.readLine();
       // System.out.println(Integer.parseInt(sub)-Integer.parseInt(sub1));
        int result = Integer.parseInt(sub)-Integer.parseInt(sub1);
        System.out.println("subtraction of given two numbers is "+ result);


    }
}


