package cn.zhaoqw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-06 21:45]
 */
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("123");
        set.add("abc");
        set.add("abc");
        set.add("123");
        set.add("aaa");
        System.out.println(set);

        //这个iterator会在整个main方法中存在
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
        //推荐使用这个
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        System.out.println("========================");
        set.forEach(System.out::println);

        System.out.println("========================");

        TreeSet treeSet = new TreeSet();
        treeSet.add("123");
        treeSet.add(1);
        treeSet.add("a");
    }
}
