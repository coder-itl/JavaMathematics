package com.coderitl;

/**
 * @author coderitl
 */
public class Program07 {
    public static void main(String[] args) {
        /* �� 1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��� */
        int number = 0, count = 0;
        int init = 5;

        for (int a = 1; a < init; a++) {
            for (int b = 1; b < init; b++) {
                for (int c = 1; c < init; c++) {
                    /*  123 = 1 * 100 + 2 * 10 + 3  */
                    number = a * 100 + b * 10 + c;
                    /* ��������: ������ͬ�����ظ����� */
                    if (a != b && a != c && b != c) {
                        System.out.print(number + " ");
                        count++;
                    }
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("�� 1��2��3��4�����֣�����ɶ໥����ͬ�����ظ����ֵ���λ�����ܸ�����: " + count);
    }
}
