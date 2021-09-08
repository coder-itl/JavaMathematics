package com.coderitl;

/**
 * @author coderitl
 */
public class Program04 {
    public static void main(String[] args) {
        /* 输出菱形 */
            /*

            @@@*
            @@***
            @*****
            @@***
            @@@*
            ------------------
           行数  空白   *数
            1    3     1
            2    2     3
            3    1     5
            4    2     3
            5    3     1
           -----------------------

             */
        for (int i = 0; i < 3; i++) {
            // 控制空格
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i > 0; i--) {
            // 控制空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

