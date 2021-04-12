package CollectionsAPI;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
    public static void main(String[] args){
        HashSet<String> a=new HashSet<String >();
        a.add("Hello");
        a.add("Goodbye");
        a.add("Test");
        a.add("Test");
        a.add("Car");
        a.add("Motorsycle");
        System.out.println(a);
        a.remove("Test");
        System.out.println(a.isEmpty());
        System.out.println(a.size());

        Iterator<String> i=a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
