public class ArrayMinimalNumber {
    public static void main(String[] args){

        int[][] a={{41,234,123},{3,4,1235},{12,1235,32}};
        int min=a[0][0];
        for(int i=0;i<3; i++){
            for(int j=0;j<3;j++){
                if (a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
