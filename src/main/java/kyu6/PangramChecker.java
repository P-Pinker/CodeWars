package kyu6;//
//A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
//
//Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
//
//


import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean check(String sentence){

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> chars = new HashSet<>();
        sentence = sentence.replaceAll("[^A-Za-z]", "").toLowerCase();

        for (char c : sentence.toCharArray()){
            chars.add(c);
        } if (chars.size() == alphabet.length()){
            return true;
        } else return false;
    }
}