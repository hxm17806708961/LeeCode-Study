package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * 逆序输出
 * @author hxmao
 * @date 2022/3/16 16:07
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            for (int i = arr.length; i > 1 ; --i) {
                System.out.print(arr[i -1] + " ");
            }
            System.out.println(arr[0]);

        }
    }
}
