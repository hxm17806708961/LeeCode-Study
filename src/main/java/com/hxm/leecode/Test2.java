package com.hxm.leecode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 明明的随机数
 * @author hxmao
 * @date 2022/3/10 10:21
 */
public class Test2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextInt());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1]) continue;
            System.out.println(arr[i]);
        }
    }

}
