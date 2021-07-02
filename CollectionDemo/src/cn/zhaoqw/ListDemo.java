package cn.zhaoqw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-02 17:15]
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,5);
        List list2 = new ArrayList();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list.addAll(list2);
        System.out.println(list);

        List<String> aaa = List.of("aaa", "bbb", "ccc");
        System.out.println(aaa);
    }
}
