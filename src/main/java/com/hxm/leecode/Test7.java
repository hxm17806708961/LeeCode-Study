package com.hxm.leecode;

import java.util.Scanner;

/**
 * HJ33 整数与IP地址间的转换
 * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 * 一个长整数。
 * 举例：一个ip地址为10.0.3.193
 * 每段数字             相对应的二进制数
 * 10                   00001010
 * 0                    00000000
 * 3                    00000011
 * 193                  11000001
 *
 * 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
 *
 * 数据范围：保证输入的是合法的 IP 序列
 *
 * 输入描述：
 * 输入
 * 1 输入IP地址
 * 2 输入10进制型的IP地址
 *
 * 输出描述：
 * 输出
 * 1 输出转换成10进制的IP地址
 * 2 输出转换后的IP地址
 *
 * 示例1
 * 输入：
 * 10.0.3.193
 * 167969729
 * 输出：
 * 167773121
 * 10.3.3.193
 * @author hxmao
 * @date 2022/3/10 15:10
 */
public class Test7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            // ip
            if(str.contains(".")){
                IpToLong(str);
            } else {
                System.out.println(getLongToIp(str));
            }

        }
    }

    private static void IpToLong(String str) {
        String binaryString = "";
        String[] arr = str.split("\\.");
        for(int i=0 ; i < arr.length ; i++){
            String s = Integer.toBinaryString(Integer.parseInt(arr[i]));
            while (s.length() < 8){
                s = "0" + s;
            }
            binaryString = binaryString + s;
        }
        System.out.println(Long.parseLong(binaryString, 2));
    }

    public static String getLongToIp(String str){
        String[] ans = new String[4];
        String longString = Long.toBinaryString(Long.parseLong(str));

        while (longString.length() < 32){
            longString = "0" + longString;
        }

        for(int i = 0; i < 4; i++){
            int anInt = Integer.parseInt(longString.substring(i * 8, (i + 1) * 8), 2);
            ans[i] = String.valueOf(anInt);
        }
        return String.join(".",ans);
    }

}
