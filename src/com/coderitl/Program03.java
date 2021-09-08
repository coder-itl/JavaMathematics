package com.coderitl;

/**
 * @author coderitl
 */
public class Program03 {
    public static void main(String[] args) {
        /* 水仙花数 */
        int num1, num2, num3;

        for (int i = 100; i < 1000; i++) {
            // 1
            num1 = i / 100;
            // 5
            num2 = (i / 10) % 10;
            // 3
            num3 = (i % 10) % 10;

            if (i == (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3)) {
                System.out.println(i);
            }

        }

    }
}
