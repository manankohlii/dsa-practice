package com.leetcode;

public class p27 {
    public static void main(String[] args) {
        int[] i = [2,3,3,3];

        removeElement(i,2);
    }
    public static int removeElement(int[] nums, int val) {
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
