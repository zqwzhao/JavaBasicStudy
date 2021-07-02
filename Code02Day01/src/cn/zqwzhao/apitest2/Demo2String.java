package cn.zqwzhao.apitest2;

/**
 * String 字符串 java.long.String
 * 所有双引号字符串，都是String，不关是不是new出来的
 *
 * 字符串特点
 * 1.字符串是常量，不能更改
 * 2.由于字符串是常量，字符串可以共享使用
 * 3.字符串相当于是一个char[]，底层是一个字节数组 final byte[]
 *
 * 创建字符串的方法
 * 三种构造
 * public String()
 * public String(char[] array)
 * public String(Byte[] array)
 * 或者直接创建
 */
public class Demo2String {
    public static void main(String[] args) {
        String str1 = new String();

        char[] arr1 = new char[]{'A', 'B', 'C'};
        String str2 = new String(arr1);

        byte[] arr2 = new byte[]{65, 66, 67};
        String str3 = new String(arr2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String str4="ABC";

    }
}
