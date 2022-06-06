package playground;

import java.sql.Time;
import java.time.*;
import java.util.TimeZone;

/**
 * Created by SK on 10/28/2021
 **/
public class TimeCompare {

    public static final ZoneId IST_ZONE_ID = ZoneId.of("Asia/Kolkata");
    public static final ZoneId UTC_ZONE_ID = ZoneId.of("UTC");

    public static void main(String[] args) {

        long now = ZonedDateTime.now(UTC_ZONE_ID).getSecond()* 1000L;
        System.out.println(now);
        long seconds = ZonedDateTime.now(UTC_ZONE_ID).toLocalTime().toSecondOfDay() * 1000L;
        System.out.println(seconds);

        long offset  = ZonedDateTime.now(IST_ZONE_ID).getOffset().getTotalSeconds() * 1000L;
        System.out.println("offset "+offset);
        long currentTimeMillis = System.currentTimeMillis();
        Time sqlTime = new Time(currentTimeMillis);
        System.out.println("SqlTime          : " + sqlTime);
        System.out.println("SqlTime in milli : " + sqlTime.getTime());
        System.out.println(getCurrentTimeInMilliSeconds(now));
    }

    public static long getCurrentTimeInMilliSeconds(long now) {
        int offset = TimeZone.getTimeZone(IST_ZONE_ID).getOffset(now);
        System.out.println("offset : "+offset);
        return now + offset;
    }
}
