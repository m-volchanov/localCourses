package homeworks.homework31;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateAndTimeForCreateUserPojo {

    public static boolean isValidDateAndTime(String dateAndTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        try {
            formatter.parse(dateAndTime);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
