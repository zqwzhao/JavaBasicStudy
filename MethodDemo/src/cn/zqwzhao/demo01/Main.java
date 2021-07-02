package cn.zqwzhao.demo01;

import java.util.Random;
import java.util.Scanner;

/**
 * 某公司打算安排员工旅游度假，但是目的地未定，
 * 请你提供5个旅游目的地供参考，并随机选择一个旅游目的地。
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-02-26 12:48]
 */
public class Main {
    public static void main(String[] args) {
        String[] place = new String[5];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //数组元素赋值
        for (int i = 0; i < place.length; i++) {
            System.out.println("请输入第"+ (i + 1) +"个旅游目的地：");
            place[i] = sc.nextLine();
        }

        //遍历数组
        System.out.println("以下地方仅供参考：");
        for (String str: place) {
            System.out.print(str + "  ");
        }

        System.out.println();
        System.out.println("随机生成的旅游目的地：" + place[random.nextInt(5)]);
    }
}
