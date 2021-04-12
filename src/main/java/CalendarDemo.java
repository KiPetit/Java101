import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args){
        Calendar cal= Calendar.getInstance();
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy H:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
