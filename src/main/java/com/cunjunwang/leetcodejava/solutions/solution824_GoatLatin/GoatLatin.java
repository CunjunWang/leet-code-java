package com.cunjunwang.leetcodejava.solutions.solution824_GoatLatin;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-08-03.
 */
@Component
public class GoatLatin {

    /**
     * A sentence S is given, composed of words separated by spaces.
     * Each word consists of lowercase and uppercase letters only.
     * <p>
     * We would like to convert the sentence to "Goat Latin" (a
     * made-up language similar to Pig Latin.)
     * <p>
     * The rules of Goat Latin are as follows:
     * <p>
     * If a word begins with a vowel (a, e, i, o, or u), append "ma"
     * to the end of the word.
     * For example, the word 'apple' becomes 'applema'.
     * <p>
     * If a word begins with a consonant (i.e. not a vowel), remove the
     * first letter and append it to the end, then add "ma".
     * For example, the word "goat" becomes "oatgma".
     * <p>
     * Add one letter 'a' to the end of each word per its word index in
     * the sentence, starting with 1.
     * For example, the first word gets "a" added to the end, the second
     * word gets "aa" added to the end and so on.
     * <p>
     * Return the final sentence representing the conversion from S to Goat Latin.
     * <p>
     * Example 1:
     * Input: "I speak Goat Latin"
     * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     * <p>
     * Example 2:
     * Input: "The quick brown fox jumped over the lazy dog"
     * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa
     * overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
     *
     * @param S
     * @return
     */
    public String toGoatLatin(String S) {
        StringBuilder result = new StringBuilder();
        String[] words = S.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") ||
                    word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
                word = word + "ma";
            } else {
                String initial = word.substring(0, 1);
                word = word.substring(1) + initial + "ma";
            }
            for (int j = 0; j < i + 1; j++) {
                word = word + "a";
            }
            result.append(word);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}
