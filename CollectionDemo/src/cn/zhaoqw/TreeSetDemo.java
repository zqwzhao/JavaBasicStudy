package cn.zhaoqw;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-07 14:17]
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Collections.addAll(set,1,2,3,4,5,6,7,8,9);
        System.out.println(set);

        HashSet<Person> pset = new HashSet<>();
        pset.add(new Person("zhangsan",13));
        pset.add(new Person("zhangsan",12));
        pset.add(new Person("zhangsan",13));
        System.out.println(pset);
        TreeSet<Person> tset = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        tset.add(new Person("zhangsan",1));
        tset.add(new Person("zhangsan",23));
        tset.add(new Person("zhangsan",15));
        System.out.println(tset);
    }
}
