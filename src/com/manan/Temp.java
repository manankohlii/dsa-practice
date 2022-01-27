package com.manan;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {

        int n = 4;

//        for(int i = 0;i<n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        for(int i = 1 ; i <= 2*n - 1 ; i++){
            if(i<=n){
                for(int j = 1 ; j<=i ; j++){
                    System.out.print("* ");
                }
            }else{

                for(int t = n ; t>=i-n+1;t--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

}

