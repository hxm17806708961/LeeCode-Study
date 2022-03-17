package com.hxm.leecode.selftest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * HJ8 合并表记录
 * 描述
 * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 *
 *
 * 提示:
 * 0 <= index <= 11111111
 * 1 <= value <= 100000
 *
 * 输入描述：
 * 先输入键值对的个数n（1 <= n <= 500）
 * 接下来n行每行输入成对的index和value值，以空格隔开
 *
 * 输出描述：
 * 输出合并后的键值对（多行）
 * @author hxmao
 * @date 2022/3/16 17:35
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<>(n);
            for (int i = 0; i < n; i++) {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                if (map.get(key) == null){
                    map.put(key, value);
                }else {
                    Integer k = map.get(key);
                    map.put(key, k + value);
                }
            }

            for (Map.Entry entry :
                    map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
