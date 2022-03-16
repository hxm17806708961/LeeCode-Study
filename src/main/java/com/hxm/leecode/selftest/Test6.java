package com.hxm.leecode.selftest;

import java.util.Scanner;

/**
 * 华为机试HJ17：坐标移动
 * @author hxmao
 * @date 2022/3/16 11:15
 */
public class Test6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] split = str.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > 0){
                    if ("A".equals(split[i].substring(0,1))){
                        x = x - getNum(split[i].substring(1));
                    }
                    if ("D".equals(split[i].substring(0,1))){
                        x = x + getNum(split[i].substring(1));
                    }
                    if ("W".equals(split[i].substring(0,1))){
                        y = y + getNum(split[i].substring(1));
                    }
                    if ("S".equals(split[i].substring(0,1))){
                        y = y - getNum(split[i].substring(1));
                    }
                }
            }
            System.out.println("(" + x + "," + y + ")");
        }
    }

    private static int getNum(String substring) {
        try {
            return Integer.parseInt(substring);
        } catch (Exception e){
            return 0;
        }
    }
}
