package com.coderitl;

import java.util.Scanner;

/**
 * @author coderitl
 */
public class Program05 {
    public static void main(String[] args) {
        /*
         * 最大公约数: 两个数可以共同约去的最大一个数字
         * 最小公倍数: 两个数各自的 1 2 3... 倍数之后,最小的相等的一个数子，就是最小公倍数
         * 最大公约数与最小公倍数之间的关系，两个数字的乘积 / 最大公约数 = 最小公倍数
         * Eg. 12 和 6 的最大公约数 6
         *  计算方式:
         *      12: 1 2 3 4 6 12
         *       6： 1 2 3 6
         *      12和6都可以被 6 整除
         * 辗转相减法: 12和6: (12-6)->(6,6)-> 0 所以最大公约数 6 【始终使用最大的数减去最小的数】
         *
         *
         * 公倍数计算方式:
         *  12 和 4：
         *      12: 12*1=12  12*2=24  12*3=36 12*4 ...
         *       4: 4*1=4 4*2=8  4*3=12 4*4 ...
         *  最小公倍数: 12
         *  最小公倍数: 两个数各自的 1 2 3 ... 倍数之后,最小的相等的一个数字,就是最小公倍数
         *  最大公约数与最小公倍数之间的关系: 两个数的乘积/最大公约数 = 最小公倍数
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入两个整数: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        /* 辗转相减法 存储 num1和 num2 */
        int tempX = num1;
        int tempY = num2;

        while (tempX != tempY) {
            /* 辗转相减法是使用大数减去小数 */
            if (tempX > tempY) {
                /* 始终改变的是大数 */
                tempX = tempX - tempY;
            } else {
                /* 始终改变的是大数 */
                tempY = tempY - tempX;
            }
        }
        /* 最大公约数的结果: 跳出 while 循环就是 tempX == tempY */
        int maxCommonDivisor = tempX;

        /* 最大公约数与最小公倍数之间的关系: 两个数的乘积/最大公约数 = 最小公倍数 */
        int minCommonMultiple = (num1 * num2) / maxCommonDivisor;

        System.out.println(num1 + "和" + num2 + "的最大公约数是: " + maxCommonDivisor);
        System.out.println("最小公倍数: " + minCommonMultiple);
    }
}
