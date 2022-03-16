package com.hxm.leecode.selftest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * HJ23.删除字符串中出现次数最少的字符
 * 描述
 * 实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 *
 * 数据范围：输入的字符串长度满足 1 \le n \le 20 \1≤n≤20 ，保证输入的字符串中仅出现小写字母
 *
 * 输入描述：
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 *
 * 输出描述：
 * 删除字符串中出现次数最少的字符后的字符串。
 * @author hxmao
 * @date 2022/3/16 13:45
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            Map<Character, Integer> map = new LinkedHashMap<>();

            char[] chars = str.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (map.get(chars[i]) == null){
                    map.put(chars[i], 1);
                } else {
                    int intValue = map.get(chars[i]).intValue();
                    map.put(chars[i], intValue + 1);
                }
            }

            int minNum = 100;
            for (Map.Entry<Character,Integer> entry :
                    map.entrySet()) {
                minNum = Math.min(minNum, entry.getValue());
            }

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character,Integer> entry :
                    map.entrySet()) {
                if (entry.getValue() != minNum){
                    sb.append(entry.getKey());
                }
            }


            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (sb.toString().contains(str.charAt(i) + "")){
                    res.append(str.charAt(i));
                }
            }


            System.out.println(res.toString());
        }
    }
}
