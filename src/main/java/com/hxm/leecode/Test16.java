package com.hxm.leecode;

import java.util.Scanner;

/**
 * HJ108-求最小公倍数
 * @author hxmao
 * @date 2022/3/15 15:28
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int max = Math.max(n, m);
            int min = Math.min(n, m);
            int tem = max;

            // 公约数除以 输入的数
            for (int i = 1; i <= min; i++) {
                if (tem % n == 0 && tem % m ==0){
                    break;
                } else {
                    tem = max * i;
                }
            }
            System.out.println(tem);
        }
    }
}
