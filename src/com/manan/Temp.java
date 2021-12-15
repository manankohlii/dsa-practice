package com.manan;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        int i = 0;
        int[] ans = {0, 0};
        boolean present = false;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == 1) {
                present = true;
            }
            if (nums[correct] == nums[i]) {
                i++;
            } else {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(present) {
                if (nums[j] != j + 1) {
                    ans[0] = j;
                    ans[1] = j + 1;
                }
            } else {
                if (nums[j] != j + 2) {
                    ans[0] = j+1;
                    ans[1] = 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}

