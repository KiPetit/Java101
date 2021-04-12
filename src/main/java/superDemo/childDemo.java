package superDemo;

public class childDemo extends parentDemo{
    public childDemo(){
        super();
        System.out.println("Child class constructor");
    }
    String s="Bye!";
    public void getStringData(){
        System.out.println(s);
        System.out.println(super.s);
    }
    public void gedData(){
        super.getData();
        System.out.println("Child method");
    }
public static void main(String[] args){
        childDemo cd =new childDemo();
        cd.getStringData();
        cd.getData();
}
}
