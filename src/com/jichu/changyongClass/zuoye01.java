package com.jichu.changyongClass;

/**
 * @author 彭文成
 * @version 1.0
 * 字符串指定部分字符反转
 */
public class zuoye01 {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            str = reverse(str,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str);
    }
    public static String reverse(String str, int start, int end){
        //String转成char
        if (!(str != null && start >= 0 && end > start && end < str.length())){
            throw new RuntimeException("参数不正确");
        }
        char[] charArray = str.toCharArray();
        char temp;
        for (int i = start, j = end; i < j ; i++, j--) {
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}
