package cn.zhaoqw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

        System.out.println("======================");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer  cur= iterator.next();
            if (cur.equals(1)) {
                //并发修改异常，因为移除元素的后，迭代器指针不知道指向谁了
                //iterator.remove();
                //list.remove(cur);

            }
            System.out.println(cur);
        }
        System.out.println("=========================");

        //改用listIterator 解决问题
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer  cur= listIterator.next();
            if (cur.equals(1)) {

                listIterator.remove();


            }
            System.out.println(cur);
        }

        System.out.println("===========================");
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
