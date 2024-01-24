package com.github.javabaz;
import static java.util.Arrays.copyOfRange;

public class ReverseWordsInAString {

    //151.Reverse Words in a String
    //Given an input string s, reverse the order of the words.

    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

    //Return a string of the words in reverse order concatenated by a single space.


    public String reverseWords(String s) {
        return makeTheString(reverseTheArray(removeSpaces(s)));
    }


    public static String[] removeSpaces(String s) {
        String[] words = s.split("\\s+");
        if (words[0].isEmpty()) {
            return copyOfRange(words, 1, words.length);
        }
        return words;
    }


    public static String[] reverseTheArray(String[] words) {
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        return words;
    }


    public static String makeTheString(String[] words) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            words[i] = words[i] + " ";
            sb.append(words[i]);
        }
        sb.append(words[words.length - 1]);

        return sb.toString();
    }
}