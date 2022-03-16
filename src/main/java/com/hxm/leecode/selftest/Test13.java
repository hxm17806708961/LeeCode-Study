package com.hxm.leecode.selftest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * HJ14 字符串排序
 * @author hxmao
 * @date 2022/3/16 16:16
 */
public class Test13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = Integer.parseInt(scanner.nextLine());
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLine();
            }
            Arrays.sort(arr);
            for (String str :
                    arr) {
                System.out.println(str);
            }
        }
    }
}
