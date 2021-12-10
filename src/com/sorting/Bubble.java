package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = {23,85,13,2,-98,45,33};

        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean swapped = false;

        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                   int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    return arr;
    }
}
