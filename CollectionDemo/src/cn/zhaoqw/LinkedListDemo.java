package cn.zhaoqw;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-02 18:27]
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);
        list.addFirst("aaa");
        list.addLast("bbb");
        System.out.println(list);
        System.out.println(list.element());

        list.offer("ccc");
        System.out.println(list);

        Vector vector = new Vector();
    }
}
