package com.coderitl;

/**
 * @author coderitl
 */

public class Program10 {
    public static void main(String[] args) {
        /*
         * 一个数如果恰好等于它的因子之和，这个数就称为 完数 例如 6 = 1 ＋ 2 ＋ 3.编程找出 1000 以内的所有完数
         */
        int i, j;
        int init = 1000;

        for (i = 1; i < init; i++) {

            int sum = 0;

            for (j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == i) {

                for (j = 1; j < i / 2; j++) {
                    if (i % j == 0) {
                        System.out.print(j + "\t");
                    }
                }
                System.out.println("is: " + i);
            }

        }

    }
}
