package com.recursion;

public class StringQues {
    public static void main(String[] args) {
        skip("","abcdabadc");
        System.out.println(skipAlt("abcdabadc"));
        System.out.println(skipApple("baapplemank"));
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
    public static String skipAlt(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);   //storing char at starting index in each iteration's string

        if(ch=='a'){                   //removes occurrences of 'a'
            return skipAlt(up.substring(1));       //sends string starting from next index
        }else{
            return ch + skipAlt(up.substring(1));
        }
    }
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
