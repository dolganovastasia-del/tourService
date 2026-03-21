package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeUtils {
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##00.0");

    private DateTimeUtils() {
        throw new UnsupportedOperationException("Utility Class");
    }

}
