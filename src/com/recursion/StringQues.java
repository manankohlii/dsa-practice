package com.recursion;

public class StringQues {
    public static void main(String[] args) {
        skip("","abcdabadc");
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);   //storing char at starting index in each iteration's string

        if(ch=='a'){                   //removes occurrences of 'a'
            skip(p,up.substring(1));       //sends string starting from next index
        }else{
            skip(p + ch,up.substring(1));
        }
    }
}
