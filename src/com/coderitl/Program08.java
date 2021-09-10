package com.coderitl;

import java.util.concurrent.ForkJoinPool;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

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
        double a = 1,  /*  a 分母 */
               b = 1, /* b 分子 */
               c = 0, /* c 前两项之和 */
               sum = 0; /* 前 N 项和 */

        for (int i = 0; i < 20; i++) {
            c = a + b; /* 2 = 1 + 1 */ 
            a = b; /* a=1 */
            b = c;  /* b=2 */
            sum += b / a;
        }
        System.out.println(sum);

    }
}
