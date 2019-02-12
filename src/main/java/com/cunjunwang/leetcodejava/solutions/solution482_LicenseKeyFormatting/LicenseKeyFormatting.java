package com.cunjunwang.leetcodejava.solutions.solution482_LicenseKeyFormatting;

import org.springframework.stereotype.Component;

/**
 * Create by cunjunwang on 2019/2/12
 */
@Component
public class LicenseKeyFormatting {

    /**
     * You are given a license key represented as a string S which consists only
     * alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.
     * <p>
     * Given a number K, we would want to reformat the strings such that each group
     * contains exactly K characters, except for the first group which could be
     * shorter than K, but still must contain at least one character. Furthermore,
     * there must be a dash inserted between two groups and all lowercase letters
     * should be converted to uppercase.
     * <p>
     * Given a non-empty string S and a number K, format the string according to the
     * rules described above.
     * <p>
     * Example 1:
     * Input: S = "5F3Z-2e-9-w", K = 4
     * <p>
     * Output: "5F3Z-2E9W"
     * <p>
     * Explanation: The string S has been split into two parts, each part has 4 characters.
     * Note that the two extra dashes are not needed and can be removed.
     * <p>
     * Example 2:
     * Input: S = "2-5g-3-J", K = 2
     * <p>
     * Output: "2-5G-3J"
     * <p>
     * Explanation: The string S has been split into three parts, each part has 2 characters
     * except the first part as it could be shorter as mentioned above.
     * <p>
     * Note:
     * 1. The length of string S will not exceed 12,000, and K is a positive integer.
     * 2. String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
     * 3. String S is non-empty.
     *
     * @param S
     * @param K
     * @return
     */
    public String licenseKeyFormatting(String S, int K) {
        String noDash = S.replace("-", "");
        if(noDash.isEmpty()) {
            return "";
        }
        int firstLength = noDash.length() % K;
        StringBuilder builder = new StringBuilder();
        if (firstLength != 0) {
            builder.append(noDash.substring(0, firstLength)).append("-");
        }
        for (int i = firstLength; i < noDash.length(); i = i + K) {
            builder.append(noDash.substring(i, i + K)).append("-");
        }
        return builder.toString().substring(0, builder.toString().length() - 1).toUpperCase();
    }

}
