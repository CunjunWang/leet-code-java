package com.cunjunwang.leetcodejava.solutions.solution811_SubdomainVisitCount;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Create by cunjunwang on 2019/2/17
 */
@Component
public class SubdomainVisitCount {


    /**
     * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com",
     * at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a
     * domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
     * <p>
     * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received),
     * followed by a space, followed by the address. An example of a count-paired domain might be
     * "9001 discuss.leetcode.com".
     * <p>
     * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains,
     * (in the same format as the input, and in any order), that explicitly counts the number of visits to
     * each subdomain.
     * <p>
     * Example 1:
     * Input:
     * ["9001 discuss.leetcode.com"]
     * Output:
     * ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
     * Explanation:
     * We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and
     * "com" will also be visited. So they will all be visited 9001 times.
     * <p>
     * Example 2:
     * Input:
     * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
     * Output:
     * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
     * Explanation:
     * We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times.
     * For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5
     * times.
     * <p>
     * Notes:
     * <p>
     * The length of cpdomains will not exceed 100.
     * The length of each domain name will not exceed 100.
     * Each address will have either 1 or 2 "." characters.
     * The input count in any count-paired domain will not exceed 10000.
     * The answer output can be returned in any order.
     *
     * @param cpdomains
     * @return
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String domains = cpdomain.split(" ")[1];
            Integer count = Integer.valueOf(cpdomain.split(" ")[0]);
            recursivelyPutInMap(domains, count, countMap);
        }
        List<String> result = new ArrayList<>();
        Iterator iterator = countMap.keySet().iterator();
        while (iterator.hasNext()) {
            StringBuilder builder = new StringBuilder();
            String key = (String) iterator.next();
            builder.append(countMap.get(key)).append(" ").append(key);
            result.add(builder.toString());
        }
        return result;
    }

    private void recursivelyPutInMap(String cpdomain, Integer count, Map<String, Integer> countMap) {
        if (countMap.get(cpdomain) == null) {
            countMap.put(cpdomain, count);
        } else {
            Integer originCount = countMap.get(cpdomain);
            Integer newCount = originCount + count;
            countMap.put(cpdomain, newCount);
        }
        if (cpdomain.contains(".")) {
            int firstIndex = cpdomain.indexOf(".");
            recursivelyPutInMap(cpdomain.substring(firstIndex + 1), count, countMap);
        }
    }

}
