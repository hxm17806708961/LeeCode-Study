package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * HJ15 求int型正整数在内存中存储时1的个数
 * @author hxmao
 * @date 2022/3/16 16:48
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int anInt = scanner.nextInt();
            String toBinaryString = Integer.toBinaryString(anInt);
            int num = 0;
            for (int i = 0; i < toBinaryString.length(); i++) {
                if (toBinaryString.charAt(i) == '1'){
                    ++num;
                }
            }
            System.out.println(num);
        }
    }
}
