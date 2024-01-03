package domain.Calendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        System.out.printf("Current Date: %02d/%02d/%d %02d:%02d:%d", day, month, year, hour, minutes, seconds);
        System.out.println();
        System.out.println(day + "/" + month + "/" + year + " " + hour + ":" + minutes + ":" + seconds);


        GregorianCalendar calendar2 = new GregorianCalendar();
        System.out.println(calendar2.isLeapYear(2024));
    }

}
