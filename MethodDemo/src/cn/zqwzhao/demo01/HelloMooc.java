package cn.zqwzhao.demo01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-02-25 10:43]
 */
public class HelloMooc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入充值金额：");
        int money = sc.nextInt();
        System.out.println("您有" + (money/100) + "次抽奖机会。");
        int num;
        for (int i = 1; i <= money/100; i++) {
            num = random.nextInt(10) + 1;
            System.out.println(num);
            switch (num) {
                case 1:
                    System.out.println("恭喜您抽中一等奖--键盘一台");
                    break;
                case 2:
                    System.out.println("恭喜您抽中二等奖--鼠标一个");
                    break;
                case 3:
                    System.out.println("恭喜您抽中三等奖--纪念品一个");
                    break;
                default:
                    System.out.println("很遗憾，下次再来！");
            }
        }
    }
}
