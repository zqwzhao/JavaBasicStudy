package cn.zqwzhao.apitest2;


/**
 * String 当中与转换相关的方法有
 *
 * public char[] toCharArray(String str) 将参数字符串拆分成字符数组并返回该字符数组
 * public byte[] getBytes() 获得当前字符串底层的字符数组
 * public String replace(CharSequencce oldString, CharSequencce newString)
 * 将所有出现的老字符串替换成新字符串
 */

public class Demo6StringConvert {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("=============");
        byte[] arr = "abc".getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str1 = "我草你吗,跟个傻子一样,傻逼东西";
        String str2 = str1.replace("傻逼","**");
        System.out.println(str1);
        System.out.println(str2);
    }
}
