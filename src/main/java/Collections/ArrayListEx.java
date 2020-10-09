package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {

    static void example(){

        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(12);
        alist.add(21);
        alist.add(38);
        alist.add(45);

        System.out.println(alist);

        Iterator itr = alist.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Listiterator");

        ListIterator ltr = alist.listIterator(alist.size());
        while (ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }

    }

    public static void main(String[] args) {
        example();
    }
}
