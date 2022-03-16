package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * @author hxmao
 * @date 2022/3/16 9:45
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(Integer.parseInt(s.substring(2), 16));
            int i = Integer.decode(s);
            System.out.println(i);
        }
    }
}
