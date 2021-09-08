package com.coderitl;

public class Program02 {
    public static void main(String[] args) {

        int row = 10;
        int[][] yanghui = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }

    }
}
