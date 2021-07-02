package cn.zqwzhao.apitest2;

/**
 * 字符串截取方法
 *
 * public String substring(int index) 截取从参数位置到末尾的字符串，返回这个新的字符串
 * public String substring(int begin, int end) 截取从begin开始到end结束的字符串 [begin, end)
 */
public class Demo5SubString {
    public static void main(String[] args) {
        String str = "HelloWorldHello";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,10));
    }
}
