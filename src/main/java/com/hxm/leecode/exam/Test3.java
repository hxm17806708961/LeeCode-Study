package com.hxm.leecode.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 时间算法
 * 生成犯人出现的最近时间
 *
 * 23:39
 * 12:78
 * @author hxmao
 * @date 2022/3/17 9:30
 */
public class Test3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            String str = scanner.nextLine();
            int h1 = Integer.parseInt(str.substring(0, 1));
            int h2 = Integer.parseInt(str.substring(1, 2));
            int m1 = Integer.parseInt(str.substring(3, 4));
            int m2 = Integer.parseInt(str.substring(4));
            int[] arr = new int[4];
            arr[0] = h1;
            arr[1] = h2;
            arr[2] = m1;
            arr[3] = m2;

            int minData = Math.min(h1,h2);
            minData = Math.min(m1,minData);
            minData = Math.min(m2, minData);

            Arrays.sort(arr);

            // 加m2
            int max = getMinData(arr, m2);
            if (m2 < max){
                printData(h1,h2,m1,max);
                continue;
            }
            // 加m1, m2取最小值
            max = getMinData(arr,m1);
            if (max < 6 && m1 < max){
                printData(h1,h2,max,minData);
                continue;
            }
            // 加小时
            max = getMinData(arr, h2);
            if (h1 == 1 && h2 < max){
                printData(h1,max,minData,minData);
                continue;
            }
            if (h1 == 2 && h2 < max && max < 4){
                printData(h1,max,minData,minData);
                continue;
            }
            max = getMinData(arr, h1);
            if (h1 < max && max < 3){
                printData(max,minData,minData,minData);
                continue;
            }

            // 加天
            printData(minData, minData, minData, minData);
        }
    }

    private static void printData(int h1, int h2, int m1, int m2) {
        System.out.println(h1 + "" + h2 + ":" + m1 + "" +m2);
    }

    private static int getMinData(int[] arr, int m2) {
        for (int i = 0; i < arr.length; i++) {
            if (m2 < arr[i]){
                return arr[i];
            }
        }
        return m2;
    }

}
