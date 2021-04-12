import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args){
        ArrayList<String> a =new ArrayList<>(); //<ANY OBJECT>
        a.add("Hello");
        a.add("Goodbye");
        a.add("Hello");
        a.add(0, "What"); //It won't replace previous
        System.out.println(a);
        /*a.remove(1);
        System.out.println(a);
        a.remove("What");
        System.out.println(a);
        a.removeAll();*/
        System.out.println(a.get(2)); //Single element
        System.out.println(a.contains("test")); //boolean
        System.out.println(a.indexOf("Hello")); //Get index
        System.out.println(a.isEmpty()); //True if empty
        System.out.println(a.size()); //Get size of array


    }
}
