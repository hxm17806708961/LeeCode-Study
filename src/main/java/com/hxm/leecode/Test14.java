package com.hxm.leecode;

/**
 * leetcode 204.计数质数
 *
 * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 * @author hxmao
 * @date 2022/3/15 14:04
 */
public class Test14 {
    public static void main(String[] args) {

        int n = 10;
        boolean[] notPrime = new boolean[n];
        int num = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false){
                num ++;
                for (int j = 2; i * j < n; j++){
                    notPrime[i * j] = true;
                }
            }

        }
        System.out.println(num);
    }

    // 超时
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
