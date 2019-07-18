package com.cunjunwang.leetcodejava.solutions.solution1108_DefangingAnIPAddress;

import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-07-18.
 */
@Component
public class DefangingAnIPAddress {

    /**
     * Given a valid (IPv4) IP address, return a defanged
     * version of that IP address.
     * A defanged IP address replaces every period "." with "[.]".
     * <p>
     * Example 1:
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     * <p>
     * Example 2:
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     * <p>
     * Constraints:
     * The given address is a valid IPv4 address.
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}