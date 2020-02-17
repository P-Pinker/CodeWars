package kyu7;

import java.util.List;

/**
 * Find the last element of the given argument(s).
 * Examples
 *
 * last(Arrays.asList(1, 2, 3, 4)); // =>  4
 * last("xyz");                     // => "z"
 * last(1, 2, 3, 4);                // =>  4
 * last(new int[]{1, 2, 3, 4});     // =>  4
 */

public class SolutionLast {

    public static <T> T last(final List<T> list) {
        return list.get(list.size() -1);
    }

    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }

    public static <T> T last(final T... list) {
        return list[list.length - 1];
    }
}
