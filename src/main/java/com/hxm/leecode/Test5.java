package com.hxm.leecode;

import java.util.Scanner;

/**
 * HJ17 坐标移动
 * @author hxmao
 * @date 2022/3/10 13:47
 */
public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A10;S20;W10;D30;X;A1A;B10A11;;A10;
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(";");

            int x = 0;
            int y = 0;

            for(int i = 0; i < arr.length ; i++){
                if (arr[i].length() > 1){

                // 向左
                if("A".equals(arr[i].substring(0,1))){
                    int num = getNum(arr[i].substring(1));
                    x = x - num;
                }
                // 向上
                if("W".equals(arr[i].substring(0,1))){
                    int num = getNum(arr[i].substring(1));
                    y = y + num;
                }
                // 向下
                if("S".equals(arr[i].substring(0,1))){
                    int num = getNum(arr[i].substring(1));
                    y = y - num;
                }
                // 向右
                if("D".equals(arr[i].substring(0,1))){
                    int num = getNum(arr[i].substring(1));
                    x = x + num;
                }
                }

            }

            System.out.println(x + "," + y);
        }
    }

    public static int getNum(String num){
        try {
            return Integer.parseInt(num);
        }catch(Exception e){
            return 0;
        }
    }

}
