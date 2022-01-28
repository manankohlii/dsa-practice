package com.recursion;
//s&t both 0(n)
public class nto1_and_rev {
    public static void main(String[] args) {

//        print(5);
        printrev(5);
    }
    static void print(int n){
        if(n==0){
            return;                    // n to 1
        }
        System.out.println(n);
        print(n-1);
    }
    static void printrev(int n){
            if(n == 0){                  // 1 to n
                return;
            }
            printrev(n-1);
        System.out.println(n);
    }
}
