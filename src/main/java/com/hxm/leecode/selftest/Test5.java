package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * NC68.跳台阶
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个 n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 示例：
 *
 * 输入：2      返回值：2
 *
 * 说明：青蛙要跳上两级台阶有两种跳法，分别是：先跳一级，再跳一级或者直接跳两级。因此答案为2
 *
 * @author hxmao
 * @date 2022/3/16 11:04
 */
public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int num = jump(n);
            System.out.println(num);
        }
    }

    private static int jump(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return jump(n -1) + jump(n -2);
    }
}
