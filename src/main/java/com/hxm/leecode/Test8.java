package com.hxm.leecode;

import java.util.Scanner;

/**
 * 字符串反转
 * @author hxmao
 * @date 2022/3/10 16:43
 */
public class Test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++ ){
                System.out.print(str.charAt(str.length() - i -1));
            }
        }
    }
}
