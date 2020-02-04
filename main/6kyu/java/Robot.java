import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Vicky is quite the small wonder. Most people don't even realize she's not a real girl,
 * but a robot living amongst us. Sure, if you stick around her home for a while you might see her creator
 * open up her back and make a few tweaks and even see her recharge in the closet instead of sleeping in a bed.
 * In this kata, we're going to help Vicky keep track of the words she's learning.
 * Write a function, learnWord(word) which is a method of the Robot object.
 * The function should report back whether the word is now stored, or if she already knew the word.
 */
public class Robot {

    private Set<String> words = new HashSet<>(Arrays.asList(
            "thank", "you", "for", "teaching", "me", "i", "already",
            "know", "the", "word", "do", "not", "understand", "input"));

    private String thankYou = "Thank you for teaching me ";
    private String alreadyKnow = "I already know the word ";
    private String doNotUnderstand = "I do not understand the input";

    public Robot(){}

    public String learnWord(String input) {

        if (!Pattern.matches("[a-zA-Z]+", input)) {
            return doNotUnderstand;
        } else if (words.contains(input.toLowerCase().trim())) {
            return alreadyKnow + input;
        } else {
            words.add(input.toLowerCase().trim());
            return thankYou + input;
        }
    }
}