package cn.zqwzhao.apitest2;

/**
 * 字符串常量池，用“”号直接创建的字符串在字符串常量池
 *
 * 对于基本类型 ==是比较值
 * 对于引用类型 ==是比较地址
 *
 * public boolean equals(Object obj) :参数可以是任何对象
 * public boolean equalsIgnoreCase(Object obj) 忽略大小写比较
 * 注意:
 * 1.equals具有对称性  a.equals(b)   ===  b.equals(a)
 * 2.如果比较双方一个常量一个变量，推荐 常量.equals(变量)
 */
public class Demo3StringEquals {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] arr = new char[]{'a','b','c'};
        String str3 = new String(arr);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("abc".equals(str1));
    }
}
