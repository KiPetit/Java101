public class exceptionDemo {


    public static void main(String[] args){
        int b=7;
        int c=0;
        try{
            int k = b / c;
                System.out.println(k);
                int arr[]=new int[5];
            System.out.println(arr[7]);
        }
        catch (ArithmeticException e){
            System.out.println("Got an arithmetic exception");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds exception");
        }
        catch(Exception e){
            System.out.println("I got control if exception found");
        }
        finally{
            System.out.println("Will execute anyway");
        }
    }
}
