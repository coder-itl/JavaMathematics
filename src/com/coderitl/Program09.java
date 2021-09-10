package com.coderitl;

public class Program09 {
    public static void main(String[] args) {
          /* 已知: s = 1 - 1/2 + 1/3 -1/4 +…+1/(n-1)-1/n,编写程序求解 n = 100时的S值 */
          double s = 1;
          int i = 2;
          while (i <= 100) {
              if (i % 2 == 0) {
                  s = s - 1 / (double) i;
              } else {
                  s = s + 1 / (double) i;
              }
              i++;
          }
          System.out.println(s);
    }
}
