package cn.zqwzhao.demo01;

/**
 * @Auther: zqwzh
 * @Date: 2020/5/17 12:44
 * @Description:
 * @version:
 */

/*
 * 方法的重载：overload
 *   方法名称一样，参数列表不同
 *
 * 方法重载与下列因素有关
 *  1. 参数的个数不同
 *  2. 参数的类型不同
 *  3. 参数的多类型顺序不同
 *
 *  方法重载与下列因素无关
 *  1. 与参数名称无关
 *  2. 与方法的返回值类型无关
 * */
public class Demo02MethodOverLoad {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = sum(1, 2);
        num2 = sum(3, 4, 5);
        num3 = sum(1, 2, 3, 4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b,int c,int d) {
        return a + b + c + d;
    }
    public static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;

    }
}
