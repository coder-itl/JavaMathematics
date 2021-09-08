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
        System.out.println(num1 + "��" + num2 + "�����Լ����: " + maxCommonDivisor);
    }
}
