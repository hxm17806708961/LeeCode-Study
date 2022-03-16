package com.hxm.leecode.selftest;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 明明的随机数
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了 N 个 1 到 1000 之间的随机整数（ N≤1000 ）
 * ，对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
 * 按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据(用于不同的调查)，希望大家能正确处理)。
 *
 * @author hxmao
 * @date 2022/3/16 10:47
 */
public class Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            Set<Integer> set = new HashSet<>(n);
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            List<Integer> list = set.stream().sorted().collect(Collectors.toList());

            for (int aa :
                    list) {
                System.out.println(aa);
            }

        }
    }

}
