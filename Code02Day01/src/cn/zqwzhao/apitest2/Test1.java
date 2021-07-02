package cn.zqwzhao.apitest2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33之间的随机整数，添加到集合并遍历集合
 *
 * 分析：
 * 1.使用Random生成随机数
 * 2.使用循环生成6个随机数，并添加到集合中
 * 3.遍历集合
 */

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            list.add(random.nextInt(33)+1);
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
