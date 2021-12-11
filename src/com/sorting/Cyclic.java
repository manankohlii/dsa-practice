package com.sorting;

import java.util.Arrays;

// For numbers in range 1-N
public class Cyclic {
    public static void main(String[] args) {

        int[] arr = {5,4,1,2,3};
        System.out.println(Arrays.toString(cyclic(arr)));
    }

    public static int[] cyclic(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        return arr;
    }
}
