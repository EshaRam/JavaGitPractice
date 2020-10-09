package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

    static void example(){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Vishnu",14);
        map.put("Esha",38);
        map.put("Anu",11);
        map.put("Theetha",43);

        Set set =map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry kv = (Map.Entry) itr.next();
            System.out.println(kv.getKey()+"-"+ kv.getValue());
        }
    }

    public static void main(String[] args) {
        example();
    }
}
