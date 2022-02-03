package com.recursion;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        int[] n = {2,3,4,1,6,7,2};
//        System.out.println(sorted(n,0));

        int target = 2;
//        System.out.println(linear(n,target,0));
//       findAllIndex(n,target,0);
//        System.out.println(list);
        System.out.println(listreturn(n,4,0));
    }
    static boolean sorted(int[] n,int i){    //sort check
        if(i==n.length-1){
            return true;
        }
        return n[i] < n[i+1] && sorted(n,i+1);
    }
    static boolean linear(int[] n, int target, int i){   //linear search
        if(i==n.length){
            return false;
        }
        return n[i]==target || linear(n,target,i+1);
    }
//    static ArrayList<Integer> list =  new ArrayList<>();    //different index where number present
//    static void findAllIndex(int[] n,int target, int i){
//        if(i==n.length){
//            return;
//        }
//        if(n[i] == target){
//                list.add(i);
//            }
//            findAllIndex(n,target,i+1);
//    }
    static ArrayList<Integer> listreturn(int[] n , int target, int i){  //concept

        ArrayList<Integer> list =  new ArrayList<>();

        if(i==n.length){
            return list;
        }
        if(n[i] == target){    //this contains answer for particular fn call
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = new ArrayList<>();
        list.addAll(ansFromBelowCalls);
        return list;

    }
    //code for rotated binary search  : conditions written
}
