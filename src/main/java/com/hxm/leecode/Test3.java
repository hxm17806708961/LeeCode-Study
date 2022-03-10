package com.hxm.leecode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 字符个数统计
 * @author hxmao
 * @date 2022/3/10 11:12
 */
public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<String> set = new HashSet();

        for(int i = 0; i < str.length(); i ++){
            set.add(str.substring(i, i + 1));
        }
        System.out.println(set.size());

    }
}
