package kyu5;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and returns
 * the time in a human-readable format (HH:MM:SS)
 *
 *     HH = hours, padded to 2 digits, range: 00 - 99
 *     MM = minutes, padded to 2 digits, range: 00 - 59
 *     SS = seconds, padded to 2 digits, range: 00 - 59
 *
 * The maximum time never exceeds 359999 (99:59:59)
 *
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTime {

    private static final int secondsInHour = 3600;
    private static final int secondsInMinute = 60;

    public static String makeReadable(int seconds) {

        String hh = Integer.toString((seconds / secondsInHour));
        String mm = Integer.toString((seconds % secondsInHour) / secondsInMinute);
        String ss = Integer.toString(seconds % secondsInMinute);

        hh = formatTime(hh);
        mm = formatTime(mm);
        ss = formatTime(ss);

        return hh + ":" + mm + ":" + ss;
    }

    private static String formatTime(String tt) {
        if (tt.length() == 1) {
            return "0" + tt;
        }
        return tt;
    }
}
