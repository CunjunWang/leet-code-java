package com.cunjunwang.leetcodejava.solutions.solution0957_PrisonCellsAfterNDays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CunjunWang on 2019-10-29.
 */
public class PrisonCellsAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int N) {
        // A map to keep seen states
        Map<String, Integer> seen = new HashMap<>();
        while (N > 0) {
            String state = Arrays.toString(cells);
            // System.out.println(state);
            seen.put(state, N--);

            int[] next = new int[8];
            next[0] = next[7] = 0;
            for (int i = 1; i < 7; i++) {
                if (cells[i-1] == cells[i+1]) {
                    next[i] = 1;
                } else {
                    next[i] = 0;
                }
            }
            cells = next;

            state = Arrays.toString(cells);
            if (seen.containsKey(state)) {
                int lastSeen = seen.get(state);
                int period = lastSeen - N;
                N = N % period;
            }
        }

        return cells;
    }

}
