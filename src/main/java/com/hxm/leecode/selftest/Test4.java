package com.hxm.leecode.selftest;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 华为机试HJ10：字符个数统计
 * @author hxmao
 * @date 2022/3/16 11:00
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            char[] array = str.toCharArray();
            HashSet<Character> set = new HashSet<Character>();
            for (char ch :
                    array) {
                set.add(ch);
            }
            System.out.println(set.size());

        }
    }
}
