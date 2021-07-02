package cn.zqwzhao.java1102.test7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int m,n,t;
        m = a;
        n = b;
        while(b!=0) {
            t =a % b;
            a = b;
            b = t;
        }

        System.out.println("最大公约数:" + a);
        System.out.println("最小公倍数:" + m*n/a);
    }
}
