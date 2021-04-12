public class StaticVar {
    String name; //Instance variables
    String address;
    static String city; //Class variables
    static int i;
    int c=0;
    static {
        city="NY";
        i=0;
    }

    public  StaticVar(String name,  String address){ //Local  variables
        this.name=name;
        this.address=address;
        i++;
        c++;
        System.out.println(i);
        System.out.println(c);
    }
    public void getAddress(){
        System.out.println(address + " "+ city);
    }
    public static void getCity(){
        System.out.println(city);
    }
    public static void main(String[] args){
        StaticVar obj=new StaticVar("John", "Manhattan");
        StaticVar obj2=new StaticVar("Sam", "Conney Island");
        StaticVar obj3=new StaticVar("Victor", "Brighton Beach");
        obj.getAddress();
        obj2.getAddress();
        obj3.getAddress();
        StaticVar.getCity();
        StaticVar.i=45;
        obj.address="New Address";
    }
}
