package com.hxm.leecode;

/**
 * LeetCode 1614. 括号的最大嵌套深度
 *
 * 可以用栈来思考
 * 遍历字符串 s，如果遇到了一个左括号，那么就将其入栈；如果遇到了一个右括号，
 * 那么就弹出栈顶的左括号，与该右括号匹配。这一过程中的栈的大小的最大值，即为 s 的嵌套深度。
 * @author hxmao
 * @date 2022/3/15 10:40
 */
public class Test12 {

    public static void main(String[] args) {
        String str = "1wf";
        char[] array = str.toCharArray();
    }
}
class Solution1 {
    public int maxDepth(String s) {
        return depth(s);
    }
    public int depth(String str){
        int maxNum = 0;
        int size = 0;
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (ch == '('){
                ++size;
                maxNum = max(maxNum, size);
            }
            if (ch == ')'){
                --size;
            }
        }
        return maxNum;
    }
    public int max(int maxNum, int size){
        if( size > maxNum){
            return size;
        }
        return maxNum;
    }
}