package Inheritance;

public class childClass extends parentClass {
    public void engine(){
        System.out.println("New engine is Installed");
    }
    public void color(){
        System.out.println(color);
    }
    public static void main(String[] args){
    childClass cc=new childClass();
    cc.audioSystem();
    cc.breaks();
    cc.gearbox();
    cc.color();
    cc.engine();
}
}
