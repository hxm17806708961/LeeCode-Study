package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * HJ20.密码验证合格程序
 * @author hxmao
 * @date 2022/3/16 11:27
 */
public class Test7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            if (str.length() <= 8){
                System.out.println("NG");
                continue;
            }
            int[] ints = new int[4];
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'a' && arr[i] <= 'z'){
                    ints[0] = 1;
                } else if (arr[i] >= 'A' && arr[i] <= 'Z'){
                    ints[1] = 1;
                } else if (arr[i] >= '0' && arr[i] <= '9'){
                    ints[2] = 1;
                } else {
                    ints[3] = 1;
                }
            }
            if (ints[0] + ints[1] + ints[2] + ints[3] < 3){
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.substring(i +1).contains(str.substring(i,i + 3))) {
                    System.out.println("GN");
                    break;
                }
            }
            System.out.println("OK");

        }
    }
}
