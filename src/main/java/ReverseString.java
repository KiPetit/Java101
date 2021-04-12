public class ReverseString {
    public static void main(String[] args) {
        String s = "Timoha";
        String s2="";
        //ahomiT
        for (int i=s.length()-1; i >= 0; i--){
            s2=s2+s.charAt(i); //concatenating
        }
        System.out.println(s2);
    }
}
