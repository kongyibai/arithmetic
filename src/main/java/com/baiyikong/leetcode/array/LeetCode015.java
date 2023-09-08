package com.baiyikong.leetcode.array;

import java.util.List;

public class LeetCode015 {
    public static void main(String[] args) {


    }

    public List<List<Integer>> threeSum(int[] nums) {
        //遇事不决，暴力破解
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    return null;
                }
            }
        }
        return null;
    }
}
