package com.coderitl;

/**
 * @author coderitl
 */
public class Program06 {
    public static void main(String[] args) {
        /* 100 以内的素数:
         *  质数(素数)是指在大于 1 的自然数中，除了 1 和 它本身以外不再有其他因数的自然数
         *  */
        for (int i = 1; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
