package cn.zhaoqw;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-02 18:46]
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        for (Integer integer : list) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
