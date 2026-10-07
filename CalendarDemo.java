import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar:");
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + c.get(Calendar.YEAR));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("\nGregorian Calendar:");
        System.out.println("Date: " + gc.get(Calendar.DATE));
        System.out.println("Month: " + (gc.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + gc.get(Calendar.YEAR));
        System.out.println("Hour: " + gc.get(Calendar.HOUR));
        System.out.println("Minute: " + gc.get(Calendar.MINUTE));
    }
}