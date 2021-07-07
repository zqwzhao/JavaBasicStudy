package cn.zhaoqw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-07 14:50]
 */
public class FanXingDemo<T> {
    private T id;
    private T fname;

    public FanXingDemo() {
    }

    public FanXingDemo(T id, T fname) {
        this.id = id;
        this.fname = fname;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getFname() {
        return fname;
    }

    public void setFname(T fname) {
        this.fname = fname;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("aaa");
        list.add(true);

        list.add(new Person("aaa",20));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }

        for (Iterator iterator= list.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        FanXingDemo<String> fx1 = new FanXingDemo<>();
        fx1.setId("111");
        fx1.setFname("bbb");
        System.out.println(fx1);

    }

    @Override
    public String toString() {
        return "FanXingDemo{" +
                "id=" + id +
                ", fname=" + fname +
                '}';
    }
}
