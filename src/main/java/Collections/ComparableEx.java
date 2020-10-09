package Collections;

import OOPs.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableEx {
    public static void example(){

        ArrayList <ComparableID>al= new ArrayList<ComparableID>();
        al.add(new ComparableID(11,"Anushree"));
        al.add(new ComparableID(14,"Vishnu"));
        al.add(new ComparableID(43,"Theetha"));
        al.add(new ComparableID(38,"Esha"));

       Collections.sort(al);


        for (ComparableID c:al) {
            System.out.println(c.name+" "+c.age);
        }


    }
    public static void main(String[] args) {
        example();
    }

}
