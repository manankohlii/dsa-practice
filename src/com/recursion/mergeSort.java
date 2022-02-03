package com.recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){    //debug most important
        if(arr.length==1){     //last element when reached ; return
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));   //left array merges first
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length)); //then right

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int i=0;  //pointer for left array
        int j=0;  //pointer for right array
        int k=0;  //pointer for merged array

        int[] mix = new int[(first.length + second.length)];

        while(i<first.length && j<second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
            while(i<first.length){     // if first arrays elements remaining
                mix[k] = first[i];
                i++;
                k++;
            }
            while(j<second.length){    // if second arrays elements remaining
                mix[k] = second[j];
                j++;
                k++;
            }
            return mix;
    }
}
