package cn.zqwzhao.apitest2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存储20个数，筛选其中的偶数，添加到小集合中
 * 要求用自定义方法来实现筛选
 *
 * 分析
 * 1.创建一个集合存储20个数字 Integer
 * 2.用Random生成随机数字
 * 3.循环20次把随机数字放进大集合
 * 4.写一个自定义方法筛选
 * 返回值类型：ArrayList 小集合
 * 方法名称：getSmallList
 * 参数列表: ArrayList 大集合
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(1000));
        }

        ArrayList<Integer> smalllist = getSmallList(list);
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.println(smalllist.get(i));
        }

    }

    /**
     * 筛选集合中偶数
     * @param list
     * @return
     */
    private static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for(int i : list) {
            if(i % 2 == 0) {
                smalllist.add(i);
            }
        }
        return smalllist;
    }
}
