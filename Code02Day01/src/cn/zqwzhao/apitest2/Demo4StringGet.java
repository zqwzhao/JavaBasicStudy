package cn.zqwzhao.apitest2;

/**
 *String 类当中与获取相关的方法有
 *
 *public int length(); 获取字符串长度
 *public String concat(String str) 拼接字符串。返回拼接好的字符串
 *public char charAt(int index) 根据索引获取字符
 *public int indexOf(String str) 查找参数字符串在本字符串中第一次出现的位置，没有找到返回-1
 *
 */
public class Demo4StringGet {

    public static void main(String[] args) {
        String str = "AERFGEGRSFGSFGHfHDGD";
        System.out.println("字符串长度"+str.length());

        System.out.println(str.concat("AAAAAA"));

        char ch = str.charAt(5);
        System.out.println(ch);
        System.out.println("============");

        System.out.println(str.indexOf("FGEGR"));
    }
}
