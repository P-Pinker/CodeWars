package kyu5;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 *
 * Examples
 *
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */

public class PigLatin {

    public static String pigIt(String str) {

        if (str.length() == 1 && isPunctuationMark(str)) {
            return str;
        }

        if (str.length() == 1 && !isPunctuationMark(str)) {
            return str + "ay";
        }

        String[] splitted = str.trim().split("\\s+");
        StringJoiner joiner = new StringJoiner(" ");

        for (String s : splitted) {
            if (isPunctuationMark(s)) {
                joiner.add(s);
            } else {
                joiner.add(doMagic(s));
            }
        }

        return joiner.toString();
    }

    private static boolean isPunctuationMark(String str) {
        String[] punctuationMarks = new String[]{"!", "?", ",", ";", ":", "/"};
        return Arrays.asList(punctuationMarks).contains(str);
    }

    private static String doMagic(String str) {
        return str.substring(1) + str.charAt(0) + "ay";
    }
}
