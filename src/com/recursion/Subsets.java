package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        //subseq("","abc");
        int[] arr = {1, 2, 3}; // use [1,2,2] for duplicate function
        List<List<Integer>> ans = iterative(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
    public static void subseq(String p, String up){     //see code for returning ArrayList
        if(up.isEmpty()){                               //also code for iterative program
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    public static List<List<Integer>> iterative(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));  //to get copies of lists already present // i is for index
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
