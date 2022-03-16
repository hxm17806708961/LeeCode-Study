package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * HJ106.字符串逆序
 * @author hxmao
 * @date 2022/3/16 16:01
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            StringBuilder sb = new StringBuilder(scanner.nextLine());
            System.out.println(sb.reverse());
        }
    }
}
