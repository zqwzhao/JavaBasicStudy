package cn.zqwzhao.apitest;

/*
* Random用来生成随机数
* Random r = new Random();
* 获取一个随机值(范围为int的范围，有正有负)
* int num = r.nextInt();
*
* 获取一个随机值,范围为[0,4)   0,1,2,3
* int num2 = r.nextInt(4);
*
* */

import java.util.Random;

public class Demo2Random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }

    }
}
