package com.leetcode;

public class p1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }
    public static int countGoodSubstrings(String s) {
        int n = s.length();
        if(n<3){
            return 0;
        }
        int count = 0;
        int i = 0;
        while(i<= n-3){
            if(s.charAt(i)==s.charAt(i+1) || s.charAt(i)==s.charAt(i+2) || s.charAt(i+1)==s.charAt(i+2)){
                count = count + 0;
            }else{
                count = count + 1;
            }
            i++;
        }
        return count;
    }
}
