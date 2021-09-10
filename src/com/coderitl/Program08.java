package com.coderitl;


/**
 * @author ccoderitl
 */

public class Program08 {
    public static void main(String[] args) {
        /* 有一分数序列：2/1,3/2,5/3,8/5,13/8,21/13...求出这个数列的前 20 项之和 */
        /*
         * 2 3 5 8 13 21 a 分子
         * 1 2 3 5 8 13 b 分母
         * -------------
         */

        int init = 20;

        double a = 1,
                b = 1,
                c = 0,
                sum = 0;

        for (int i = 0; i < init; i++) {
            c = a + b;
            a = b;
            b = c;
            sum += b / a;
        }

        System.out.println(sum);

    }
}
