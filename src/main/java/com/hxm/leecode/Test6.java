package com.hxm.leecode;


import java.util.Scanner;

/**
 * HJ20 密码验证合格程序
 * 密码要求:
 *
 * 1.长度超过8位
 *
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 *
 * 3.不能有长度大于2的不含公共元素的子串重复 （注：其他符号不含空格或换行）
 *
 * 数据范围：输入的字符串长度满足 1 \le n \le 100 \1≤n≤100
 * 输入描述：
 * 一组字符串。
 *
 * 输出描述：
 * 如果符合要求输出：OK，否则输出NG
 * @author hxmao
 * @date 2022/3/10 14:30
 */
public class Test6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.length() < 9){
                System.out.println("NG");
                continue;
            }

            int[] count = new int[4];
            for (int i = 0; i < str.length() ; i++){

                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    count[0] = 1;
                } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    count[1] = 1;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    count[2] = 1;
                } else {
                    count[3] = 1;
                }
            }

            if (count[0] + count[1] + count[3] + count[2] < 3){
                System.out.println("NG");
                continue;
            }

            if (getString(str, 0, 3)){
                System.out.println("NG");
                continue;
            }else {
                System.out.println("OK");
            }

        }

    }

    private static boolean getString(String str, int l, int r) {
        if (r >= str.length()){
            return false;
        }
        if (str.substring(r).contains(str.substring(l, r))){
            return true;
        }else {
            return getString(str, l + 1, r + 1);
        }
    }
}
