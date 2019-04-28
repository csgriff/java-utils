import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Provides some basic utilities methods for dates. 
 */
public class DateUtils {
    private static final DateFormat NICE = new SimpleDateFormat("MM-dd-yyyy");

    /**
     * Produces a nice, compactly formatted date string, using the format "MM-dd-yyyy". For 
     * instance, 04-12-2018. 
     * @param date
     *           Date object 
     * @return
     *           formatted string. 
     */
    public static String niceFormat(Date date) {
        return NICE.format(date);
    }

    /**
     * Returns a calendar object which begins on the specified day. 
     * @param nicelyFormatted
     *           date to begin calendar. This should be formatted using "MM-dd-yyyy". 
     * @return
     *           Calendar object. 
     */
    public static Calendar on(String nicelyFormatted) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(NICE.parse(nicelyFormatted));
            return cal;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
} 