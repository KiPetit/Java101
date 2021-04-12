import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date d=new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy H:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));

        }
}
