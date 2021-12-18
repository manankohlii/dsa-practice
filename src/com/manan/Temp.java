package com.manan;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {

        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int ans = 0;
        while(i< nums.length){
            int correct  = nums[i] - 1;
            if(nums[i]>0 && nums[correct] != nums[i] && nums[i]<= nums.length){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans = j+1;
            }
        }
    return ans;
    }
}

