package com.coderitl;


/**
 * @author ccoderitl
 */

public class Program08 {
    public static void main(String[] args) {
        /* ��һ�������У�2/1,3/2,5/3,8/5,13/8,21/13...���������е�ǰ 20 ��֮�� */
        /*
         * 2 3 5 8 13 21 a ����
         * 1 2 3 5 8 13 b ��ĸ
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
        System.out.println();
        System.out.println("������е�ǰ 20 ��֮��: "+sum);

    }
}
