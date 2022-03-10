package com.hxm.leecode;

import java.util.Scanner;

/**
 * NC68.跳台阶
 * @author hxmao
 * @date 2022/3/10 11:23
 */
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(jump(sc.nextInt()));

    }

    public static int jump(int n){
        if(n <= 1){
            return 1;
        }
        return jump(n -1) + jump(n - 2);
    }
}
