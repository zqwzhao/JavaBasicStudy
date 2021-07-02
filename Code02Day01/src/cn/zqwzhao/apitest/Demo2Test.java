package cn.zqwzhao.apitest;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 * 随机生成一个数字 [1,N),然后猜数字
 * <p>
 * 思路：
 * 1.产生一个随机数
 * 2.键盘输入数字 猜
 * 3.大了小了给提示，猜中退出
 */
public class Demo2Test {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(100)+1;
        int guess = 0;
        Scanner sc=new Scanner(System.in);
        while(num!=guess) {
           guess = sc.nextInt();
           if(guess > num) {
               System.out.println("大了,请重试");
           }else if(guess < num) {
               System.out.println("小了,请重试");
           }else {
               System.out.println("猜中了");
           }
        }


    }
}
