package com.coderitl;

/**
 * @author coderitl
 */
public class Program07 {
    public static void main(String[] args) {
        /* 有 1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少 */
        int number = 0, count = 0;
        int init = 5;

        for (int a = 1; a < init; a++) {
            for (int b = 1; b < init; b++) {
                for (int c = 1; c < init; c++) {
                    /*  123 = 1 * 100 + 2 * 10 + 3  */
                    number = a * 100 + b * 10 + c;
                    /* 条件限制: 互不相同且无重复数字 */
                    if (a != b && a != c && b != c) {
                        System.out.print(number + " ");
                        count++;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("有 1、2、3、4个数字，能组成多互不相同且无重复数字的三位数的总个数是: " + count);
    }
}
