package com.backtracking;

public class backtrack_findpath {
    public static void main(String[] args) {
        obstacle("", 3, 3);
    }

    public static void findPath(String s, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(s);
            return;
        }
        if (r > 1) {
            findPath(s + 'D', r - 1, c);
        }
        if (c > 1) {
            findPath(s + 'R', r, c - 1);
        }

    }

    public static void obstacle(String s, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(s);
            return;
        }
        if(r==2 && c==2){
            return;
        }
        if (r > 1) {
            obstacle(s + 'D', r - 1, c);
        }
        if (c > 1) {
            obstacle(s + 'R', r, c - 1);
        }

    }
}