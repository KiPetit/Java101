import java.util.ArrayList;

public class uniqueNumber {
    public static void main(String[]  args){
        int[] a={4,4,5,5,6,6,7,3,4,1,4,7,4,6,7,4,3,7,4};
        //Print how many time number is repeated
        ArrayList<Integer> al= new ArrayList<>();
        //Print unique number from the list
        for(int i=0; i<a.length; i++){
            int k=0;
            if(!al.contains(a[i])){
                al.add(a[i]);
                k++;

                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        k++;
                    }
                }
                System.out.println(a[i]);
                System.out.println(k);
                if(k==1){
                    System.out.println(a[i]+  " is unique number");
                }
            }
        }
   }
}
