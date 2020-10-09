package ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonNumber {
    static void checkcommon(){
        int arr[]= {21,12,5,38,43};
        int arr1[]= {12,30,6,21,45};

        List a = Arrays.asList(arr);



        List<Integer> alist = Arrays.asList(12,30,6,21,45);
        List<Integer> blist = Arrays.asList(new Integer[]{12,38,14,21,60});

        HashSet<Integer> aset = new HashSet<>(alist);
        aset.retainAll(blist);
        System.out.println(aset);
    }

    static void comm(){

        int arr [] = {12,21,14,11,43};
        int arr1[]= {38,70,14,11,5};

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){

                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        comm();
        checkcommon();

    }




}
