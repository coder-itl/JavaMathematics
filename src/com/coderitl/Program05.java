package com.coderitl;

import java.util.Scanner;

/**
 * @author coderitl
 */
public class Program05 {
    public static void main(String[] args) {
        /*
         * ���Լ��: ���������Թ�ͬԼȥ�����һ������
         * ��С������: ���������Ե� 1 2 3... ����֮��,��С����ȵ�һ�����ӣ�������С������
         * ���Լ������С������֮��Ĺ�ϵ���������ֵĳ˻� / ���Լ�� = ��С������
         * Eg. 12 �� 6 �����Լ�� 6
         *  ���㷽ʽ:
         *      12: 1 2 3 4 6 12
         *       6�� 1 2 3 6
         *      12��6�����Ա� 6 ����
         * շת�����: 12��6: (12-6)->(6,6)-> 0 �������Լ�� 6 ��ʼ��ʹ����������ȥ��С������
         *
         *
         * ���������㷽ʽ:
         *  12 �� 4��
         *      12: 12*1=12  12*2=24  12*3=36 12*4 ...
         *       4: 4*1=4 4*2=8  4*3=12 4*4 ...
         *  ��С������: 12
         *  ��С������: ���������Ե� 1 2 3 ... ����֮��,��С����ȵ�һ������,������С������
         *  ���Լ������С������֮��Ĺ�ϵ: �������ĳ˻�/���Լ�� = ��С������
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("������������: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        /* շת����� �洢 num1�� num2 */
        int tempX = num1;
        int tempY = num2;

        while (tempX != tempY) {
            /* շת�������ʹ�ô�����ȥС�� */
            if (tempX > tempY) {
                /* ʼ�ոı���Ǵ��� */
                tempX = tempX - tempY;
            } else {
                /* ʼ�ոı���Ǵ��� */
                tempY = tempY - tempX;
            }
        }
        /* ���Լ���Ľ��: ���� while ѭ������ tempX == tempY */
        int maxCommonDivisor = tempX;

        /* ���Լ������С������֮��Ĺ�ϵ: �������ĳ˻�/���Լ�� = ��С������ */
        int minCommonMultiple = (num1 * num2) / maxCommonDivisor;

        System.out.println(num1 + "��" + num2 + "�����Լ����: " + maxCommonDivisor);
        System.out.println("��С������: " + minCommonMultiple);
    }
}
