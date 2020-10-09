package ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestNumber {

   public  void number(){
        int arr[]={12,4,56,19,21};

        for(int num: arr){
            System.out.println(num+",");
        }
        Arrays.sort(arr);
        System.out.println("sorted array is");

        for(int num:arr)
            System.out.println(num +",");
        System.out.println("largest number "+ arr[arr.length-1]);
    }


    public static void main(String[] args) {
        //number();
        LargestNumber lm = new LargestNumber();
        lm.number();


    }
}
