package Collections;

import OOPs.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorEx {

    public static void example(){
        ArrayList al = new ArrayList();
        al.add(new Student(12,"Anushree"));
        al.add(new Student(13,"Vishnu"));
        al.add(new Student(14,"Theetha"));
        al.add(new Student(15,"Esha"));

       Collections.sort(al,new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Student su = (Student)itr.next();
            System.out.println(su.getName()+su.getId());
        }


    }

    public static void main(String[] args) {
        example();
    }
}
