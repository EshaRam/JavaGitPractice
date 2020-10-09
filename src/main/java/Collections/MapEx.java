package Collections;
/*Write a program which takes an input series
 as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 */

import java.util.*;

public class MapEx {

    static void check(){
        List<String> alist = Arrays.asList("a1,a2,a3,a4,a5".split(","));
        List<String> blist = Arrays.asList("b1,b2,b3,b4,b5".split(","));
        Map<String,String> map = new LinkedHashMap<String,String>();

        for (int i=0; i<alist.size(); i++) {
            map.put(alist.get(i), blist.get(i));
        }

        System.out.println(map);
    }


    public static void main(String[] args) {
        check();
    }
}

