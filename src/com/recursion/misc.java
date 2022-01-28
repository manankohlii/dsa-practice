package com.recursion;

public class misc {
    public static void main(String[] args) {
        int n = 7;
//        System.out.println(fact(n));
//        System.out.println(sum(3));
//        System.out.println(sod(1));
//        System.out.println(prod(505));
        System.out.println(countzero(30130,0));
    }
    static int fact(int n){              // factorial of n
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){                // sum of first n natural numbers
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    static int sod(int n){               // sum of digits
        if(n/10==0){
            return n;
        }
        return n % 10 + sod(n/10);
    }
    static int prod(int n){               // product of digits
        if(n/10==0){                      // use if(n%10==0) return n; if zero needs to be ignored in number (eg 505)
            return n;
        }
        return n % 10 * (prod(n/10));
    }
    static int countzero(int n,int c){   //count number of zeroes
        if(n/10==0){
            return c;
        }
        if(n%10 == 0){
            return countzero(n/10,c+1);
        }else{
            return countzero(n/10,c);
        }
    }
}
