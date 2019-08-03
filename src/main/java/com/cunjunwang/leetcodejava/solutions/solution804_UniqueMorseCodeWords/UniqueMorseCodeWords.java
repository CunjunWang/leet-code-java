package com.cunjunwang.leetcodejava.solutions.solution804_UniqueMorseCodeWords;

import org.springframework.stereotype.Component;

import java.util.TreeSet;

/**
 * Created by CunjunWang on 2019-08-03.
 */
@Component
public class UniqueMorseCodeWords {

    /**
     * International Morse Code defines a standard encoding where each letter
     * is mapped to a series of dots and dashes, as follows: "a" maps to ".-",
     * "b" maps to "-...", "c" maps to "-.-.", and so on.
     * <p>
     * For convenience, the full table for the 26 letters of the English alphabet
     * is given below:
     * <p>
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
     * "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     * Now, given a list of words, each word can be written as a concatenation of the
     * Morse code of each letter. For example, "cba" can be written as "-.-..--...",
     * (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation,
     * the transformation of a word.
     * <p>
     * Return the number of different transformations among all words we have.
     * <p>
     * Example:
     * Input: words = ["gin", "zen", "gig", "msg"]
     * Output: 2
     * Explanation:
     * The transformation of each word is:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     * <p>
     * There are 2 different transformations, "--...-." and "--...--.".
     * <p>
     * Note:
     * <p>
     * The length of words will be at most 100.
     * Each words[i] will have length in range [1, 12].
     * words[i] will only consist of lowercase letters.
     *
     * @param words
     * @return
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet<String> set = new TreeSet<>();
        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                result.append(codes[character - 'a']);
            }
            set.add(result.toString());
        }
        return set.size();
    }

}
