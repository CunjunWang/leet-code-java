package com.cunjunwang.leetcodejava.solutions.solution448_FindAllNumbersDisappearedInAnArray;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by CunjunWang on 2019-08-02.
 */
@Component
public class FindAllNumbersDisappearedInAnArray {

    /**
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
     * some elements appear twice and others appear once.
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     * <p>
     * Could you do it without extra space and in O(n) runtime? You may assume
     * the returned list does not count as extra space.
     * <p>
     * Example:
     * Input:
     * [4,3,2,7,8,2,3,1]
     * Output:
     * [5,6]
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, 0);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                list.add(key);
            }
        }
        return list;
    }

}
