package com.cunjunwang.leetcodejava.solutions.solution0134_GasStation;

/**
 * Created by CunjunWang on 2019-09-21.
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalTank = 0;
        int curTank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; ++i) {
            int netTank = gas[i] - cost[i];
            totalTank += netTank;
            curTank += netTank;
            if (curTank < 0) {
                start = i + 1;
                curTank = 0;
            }
        }

        return totalTank < 0 ? -1 : start;
    }

}
