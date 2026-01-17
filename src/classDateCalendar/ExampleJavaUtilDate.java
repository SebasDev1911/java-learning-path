package classDateCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date); // Print the current date

        // A new instance is created, which saves the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'of' MMMM yyyy");

        // The .format method allows you to apply the desired format to the current date, which is the instantiated object
        String dateStr = dateFormat.format(date);

        long j=0;
        for(int i=0; i<1000000000; i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date date2 = new Date();
        long timeEnd = date2.getTime() - date.getTime();
        System.out.println("timeEnd = " + timeEnd);
        System.out.println("dateStr = " + dateStr);
    }
}
