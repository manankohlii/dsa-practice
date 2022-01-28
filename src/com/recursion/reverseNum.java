package com.recursion;

public class reverseNum {
    public static void main(String[] args) {
        int n = 132;
        int digits = (int)(Math.log10(n)) + 1;

        System.out.println(palin(n));
        System.out.println(rev2(n,digits));
    }
    // way 1 using static variable can check
    static int rev2(int n, int base){           //effective
        if(n/10==n){
            return n;
        }
        return (int) ((n % 10)*Math.pow(10,base-1) + (rev2(n/10,base-1)));
    }
    static boolean palin(int n){                   //check if palindrome
        int var = (int) (Math.log10(n)) + 1;
        return n == rev2(n,var);
    }
}
