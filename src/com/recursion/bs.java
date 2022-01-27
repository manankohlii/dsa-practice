package com.recursion;

public class bs {
    public static void main(String[] args) {
        int arr[] = {10,22,33,54,23};
        int target = 23;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }
        int mid  = s + (e-s) / 2 ;
        if(arr[mid] == target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}
