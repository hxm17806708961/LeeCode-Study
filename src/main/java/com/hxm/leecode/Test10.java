package com.hxm.leecode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  *HJ28.素数伴侣
 *
 *  题目描述
 * 若两个正整数的和为素数，则这两个正整数称之为“素数伴侣”，如2和5、6和13，它们能应用于通信加密。现在密码学会请你设计一个程序，从已有的 N （ N 为偶数）个正整数中挑选出若干对组成“素数伴侣”，挑选方案多种多样，例如有4个正整数：2，5，6，13，如果将5和6分为一组中只能得到一组“素数伴侣”，而将2和5、6和13编组将得到两组“素数伴侣”，能组成“素数伴侣”最多的方案称为“最佳方案”，当然密码学会希望你寻找出“最佳方案”。
 *
 * 输入:
 *
 * 有一个正偶数 n ，表示待挑选的自然数的个数。后面给出 n 个具体的数字。
 *
 * 输出:
 *
 * 输出一个整数 K ，表示你求得的“最佳方案”组成“素数伴侣”的对数。
 *
 *
 * 数据范围： 1 \le n \le 100 \1≤n≤100  ，输入的数据大小满足 2 \le val \le 30000 \2≤val≤30000
 * 输入描述：
 * 输入说明
 * 1 输入一个正偶数 n
 * 2 输入 n 个整数
 *
 * 输出描述：
 * 求得的“最佳方案”组成“素数伴侣”的对数。
 */
public class Test10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // 偶数
            ArrayList<Integer> evens = new ArrayList();
            ArrayList<Integer> adds = new ArrayList();

            for (int i = 0; i < n; i++) {
                if ((arr[i] & 1) == 1) {
                    evens.add(arr[i]);
                } else {
                    adds.add(arr[i]);
                }
            }
            int[] evensMatch = new int[evens.size()];
            int count = 0;
            for (int i = 0; i < adds.size(); i++) {
                int[] used = new int[evens.size()];
                if (find(used, evens, adds.get(i), evensMatch)){
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    public static boolean isPrime(int m) {
        for (int i = 2; i * i <= m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean find(int[] used, ArrayList<Integer> evens, int num, int[] evensMatch) {
        for (int i = 0; i < evens.size(); i++) {
            if (isPrime(num + evens.get(i)) && used[i] == 0) {
                used[i] = 1;
                if (evensMatch[i] == 0 || find(used, evens, evensMatch[i], evensMatch)) {
                    evensMatch[i] = num;
                    return true;
                }
            }
        }
        return false;
    }
}