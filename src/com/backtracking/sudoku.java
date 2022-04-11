package com.backtracking;

import java.util.Arrays;
import java.util.SplittableRandom;

public class sudoku {
    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        int[][] ans = new int[9][9];
        for(int i = 0; i<9; i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == "."){
                    ans[i][j] = 0;
                    continue;
                }
                char c = board[i][j].charAt(0);
                ans[i][j] = c - '0';
            }
        }
//        SolveSudoku(ans,0,0);
        System.out.println(Arrays.deepToString(board));
    }
    public static void SolveSudoku(int[][] board, int i, int j){
        if(i == board.length){
            display(board);
            return;
        }

        int ni = 0;
        int nj = 0;
        if(j== board[0].length-1){
            ni = i+1;
            nj = 0;
        }else{
            ni = i;
            nj = j+1;
        }
        if(board[i][j] != 0){
             ni = i+1;
             nj = j;
            SolveSudoku(board,ni,nj);
        }
        for(int po = 1;po<=9;po++) {
            if (isValid(board, i, j,po) == true) {
                board[i][j] = po;
                SolveSudoku(board, ni, nj);
                board[i][j] = 0;
            }
        }

    }
    public static boolean isValid(int[][] board,int x, int y, int val){

        for(int i=0;i< board.length ; i++){
                if(board[i][y]== val){
                    return false;
                }
            }
            for(int j=0;j<board[0].length;j++){
                if(board[x][j] == val){
                    return false;
                }
            }
        int corneri = x/3 * 3;
        int cornerj = y/3 * 3;

            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    if(board[corneri+ i][cornerj + j]==val){
                        return false;
                    }
                }
            }
            return true;
    }
    public static void display(int[][] board){
        String[][] end = new String[9][9];
        for(int i =0 ; i<9; i++){
            for(int j = 0;j<9;j++){
                String s=String.valueOf(board[i][j]);
                end[i][j] = s;
            }
        }
        System.out.println(Arrays.deepToString(end));
}
}
