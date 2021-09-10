package com.coderitl;

/**
 * @author coderitl
 */
public class Program01 {
    public static void main(String[] args) {
        /* 1. 求Fibonacci数列，1、2、3、5、8、13…..前10项数的和 */
        int[] array = new int[11];
        int sum = 0;
        int init = 2;

        array[0] = 1;
        array[1] = 2;

        // 遍历初始化
        for (int i = 1; i < array.length - init; i++) {
            array[i + 1] = array[i - 1] + array[i];
        }

        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }

        System.out.println();
        System.out.println("Fibonacci sum Result is: " + sum);

    }
}
