package cn.zqwzhao.demo01;

/**
 * @Auther: zqwzh
 * @Date: 2020/5/17 13:05
 * @Description: 比较两个数据是否相等
 *               两个byte类型 ，两个short类型 两个 int类型 两个long类型
 * @version:
 */
public class Demo03MethodOverLoad {
    public static void main(String[] args) {
        int a=1, b=2;
        System.out.println(isSame(a, b));
    }

    public static boolean isSame(byte a, byte b) {
        return a == b ? true : false;
    }

    public static boolean isSame(int a, int b) {
        return a == b ? true : false;
    }

    public static boolean isSame(short a, short b) {
        return a == b ? true : false ;
    }


    public static boolean isSame(long a, long b) {
        return a == b ? true : false ;
    }
}
