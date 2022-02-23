package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        //subseq("","abc");
        int[] arr = {1, 2, 3};
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
}
