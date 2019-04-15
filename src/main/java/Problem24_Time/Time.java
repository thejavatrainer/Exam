package Problem24_Time;

import java.time.Duration;
import java.util.Date;

/**
 * Create a class Time with fields hour, minute, second
 * initialize constructor
 * method to convert to seconds
 * method to compare two Time values...
 */
public class Time {
    public long hour;
    public long minute;
    public long second;

    public Time(final long hour, final long minute, final long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static double secondsMethod1(Time time1) {

        return time1.second + time1.minute * 60 + time1.hour * 3600;
    }

    private static double secondsMethod2(Time time2) {

        return time2.second + time2.minute * 60 + time2.hour * 3600;
    }

    public static void main(String[] args) {
        Time time1 = new Time(2, 3, 5);
        Time time2 = new Time(3, 5, 6);
        System.out.println("Time1: Seconds are : " + secondsMethod1(time1));
        System.out.println("Time2: Seconds are : " + secondsMethod2(time2));

        if (secondsMethod1(time1) > secondsMethod1(time2)) {
            System.out.println("Time1 is greater than Time2");
        } else {
            System.out.println("Time2 is greater than time1");
        }
    }

}


