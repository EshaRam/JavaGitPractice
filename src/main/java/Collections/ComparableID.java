package Collections;

import OOPs.Student;

import javax.print.DocFlavor;

public class ComparableID implements Comparable<ComparableID> {
    String name;
    int age;
     ComparableID(int age, String name){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(ComparableID c) {
        if(age == c.age){
            return 0;
        }
        else if(age >c.age)
            return 1;
        else return -1;
    }
}
