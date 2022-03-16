package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * HJ33.整数与IP地址间的转换
 *描述
 * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 * 一个长整数。
 * 举例：一个ip地址为10.0.3.193
 * 每段数字 相对应的二进制数
 * 10 00001010
 * 0 00000000
 * 3 00000011
 * 193 11000001
 *
 * 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
 *
 * 本题含有多组输入用例，每组用例需要你将一个ip地址转换为整数、将一个整数转换为ip地址。
 *
 * 示例1
 * 输入：
 * 10.0.3.193
 * 167969729
 *
 * 输出：
 * 167773121
 * 10.3.3.193
 *
 * @author hxmao
 * @date 2022/3/16 15:17
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            if (str.contains(".")){
                String[] arr = str.split("\\.");
                for (int i = 0; i < arr.length; i++) {
                    String binaryString = Integer.toBinaryString(Integer.parseInt(arr[i]));
                    while (binaryString.length() < 8){
                        binaryString = "0" + binaryString;
                    }
                    arr[i] = binaryString;
                }
                String bitString = arr[0] + arr[1] + arr[2] + arr[3];
                System.out.println(Long.parseLong(bitString, 2));
            } else {
                String s = Long.parseLong(str, 2) + "";
                while (s.length() < 32){
                    s = "0" + s;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    sb.append(String.valueOf(Long.parseLong(s.substring(8 * i, 8 * i + 8), 2))).append(".");
                }
                System.out.println(sb.toString());
            }
        }

    }
}
