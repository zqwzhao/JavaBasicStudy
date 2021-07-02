package cn.zqwzhao.apitest;

import java.util.Scanner;

/**
 * 引用类型的一般使用步骤
 * 1.导包
 * import 包路径.类名
 * lang包下的类默认不需要导包，其他包的类需要导包
 * 2.创建
 * 类名称 类名 = new 类名称();
 *
 * 3.使用
 *
 *如果类只需要使用一次就可以用匿名对象
 */
public class Demo1Scanner {
    public static void main(String[] args) {
        //普通使用方式
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("num: " + num);

        //使用匿名对象
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num2);

        //匿名对象作为参数
        methodDemo(new Scanner(System.in));
    }

    private static void methodDemo(Scanner sc) {
        int num3=sc.nextInt();
        System.out.println(num3);
    }
}
