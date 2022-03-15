package com.hxm.leecode;

import java.util.Scanner;

/**
 * HJ60 查找组成一个偶数最接近的两个素数
 * 描述
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 *
 * 数据范围：输入的数据满足 4 \le n \le 1000 \4≤n≤1000
 * 输入描述：
 * 输入一个大于2的偶数
 *
 * 输出描述：
 * 从小到大输出两个素数
 *
 * 示例1
 * 输入：
 * 20
 * 复制
 * 输出：
 * 7
 * 13
 * 示例2
 * 输入：
 * 4
 * 输出：
 * 2
 * 2
 * @author hxmao
 * @date 2022/3/15 15:27
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();

            int size = 0;
            int mid = n / 2;
            for (int i = 0; i < n / 2; i++) {
                if (isPrime(mid + i) && isPrime(mid -i)){
                    size = i;
                    break;
                }
            }
            System.out.println(mid -size);
            System.out.println(mid +size);
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
