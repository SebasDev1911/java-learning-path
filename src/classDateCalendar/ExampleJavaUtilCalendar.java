package classDateCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2026, 0,25);
        Date date = calendar.getTime();
        System.out.println("date = " + date);
        System.out.println("calendar = " + calendar);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date2 = format.parse("2026-01-14");
            System.out.println("date2 = " + date2);
            System.out.println("format.format(date) = " + format.format(date));
        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
