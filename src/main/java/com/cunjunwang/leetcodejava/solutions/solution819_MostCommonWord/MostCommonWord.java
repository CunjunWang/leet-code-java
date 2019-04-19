package com.cunjunwang.leetcodejava.solutions.solution819_MostCommonWord;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by CunjunWang on 2019-04-19.
 */
@Component
public class MostCommonWord {

    /**
     * Given a paragraph and a list of banned words, return the most frequent word
     * that is not in the list of banned words.  It is guaranteed there is at least
     * one word that isn't banned, and that the answer is unique.
     * <p>
     * Words in the list of banned words are given in lowercase, and free of punctuation.
     * Words in the paragraph are not case sensitive.  The answer is in lowercase.
     * <p>
     * <p>
     * Example:
     * <p>
     * Input:
     * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
     * banned = ["hit"]
     * Output: "ball"
     * <p>
     * Explanation:
     * "hit" occurs 3 times, but it is a banned word.
     * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
     * Note that words in the paragraph are not case sensitive,
     * that punctuation is ignored (even if adjacent to words, such as "ball,"),
     * and that "hit" isn't the answer even though it occurs more because it is banned.
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = Arrays.stream(banned).map(x -> x.toLowerCase()).collect(Collectors.toList());
        String[] validParagraph = paragraph.replaceAll("[^a-zA-Z0-9\\s]", " ").toLowerCase().split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        String maxWord = null;
        int maxCount = 0;
        for (int i = 0; i < validParagraph.length; i++) {
            String word = validParagraph[i];
            if (!bannedList.contains(word) && !word.isEmpty()) {
                Integer wordCount = countMap.get(word);
                if (wordCount == null) {
                    wordCount = 1;
                    countMap.put(word, wordCount);
                } else {
                    wordCount = wordCount + 1;
                    countMap.put(word, wordCount);
                }
                if (wordCount > maxCount) {
                    maxCount = wordCount;
                    maxWord = word;
                }

            }
        }
        return maxWord;
    }

}
