public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("I am constructor"); //default
    }
    public ConstructorDemo(int a, int b){ //parametrized
        System.out.println("Parametrized constructor");
    }
    public ConstructorDemo(String name){
        System.out.println("String constructor");
    }
    public void  getData(){
        System.out.println("Data is present");
    }

    public static void main(String[] ags){
        ConstructorDemo cd=new ConstructorDemo();
        ConstructorDemo cd2=new ConstructorDemo(4,5);
        ConstructorDemo cs=new ConstructorDemo("Test");
        //cd.getData();
    }
}
