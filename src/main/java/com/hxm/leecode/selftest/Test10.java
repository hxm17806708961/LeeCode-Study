package com.hxm.leecode.selftest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * HJ101 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 描述
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 *
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，元素大小满足 0 \le val \le 100000 \0≤val≤100000
 * 输入描述：
 * 第一行输入数组元素个数
 * 第二行输入待排序的数组，每个数用空格隔开
 * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
 *
 * 输出描述：
 * 输出排好序的数字
 *
 * 示例1
 * 输入：
 * 8
 * 1 2 4 9 3 55 64 25
 * 0
 * 复制
 * 输出：
 * 1 2 3 4 9 25 55 64
 * @author hxmao
 * @date 2022/3/16 15:38
 */
public class Test10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            int n = scanner.nextInt();
            int[] arr = new int[n];
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            int type = scanner.nextInt();

            List<Integer> resList;
            if (type == 0){
                resList = list.stream().sorted().collect(Collectors.toList());
            } else {
                resList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            }

            for (int aa :
                    resList) {
                System.out.print(aa + " ");
            }
        }
    }
}
