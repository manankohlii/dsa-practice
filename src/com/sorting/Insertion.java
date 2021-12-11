package com.sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] arr = {8,4,1,5,9,2};

        for(int i =1; i<arr.length;i++){
            int temp = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
