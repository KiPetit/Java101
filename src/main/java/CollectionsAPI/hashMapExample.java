package CollectionsAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0, "Hello");
        hm.put(1, "Goodbye");
        hm.put(2, "Car");
        hm.put(4, "House");
        System.out.println(hm.get(0));  //Pass the key
        hm.remove(3);
        Set sn=hm.entrySet(); //All values stored in a set
        Iterator i=sn.iterator();
        while (i.hasNext()){
           Map.Entry mp=(Map.Entry)i.next(); //Separate key and value
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
