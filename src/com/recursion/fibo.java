package com.recursion;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

//        int ans  = fibo(4);   for debugging

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n)); // does not work for larger numbers ; see s&t complexity lecture // dynamic prog
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
