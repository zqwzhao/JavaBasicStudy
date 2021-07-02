package cn.zqwzhao.apitest2;

import java.util.ArrayList;

/**
 * ArrayList
 *
 * public boolean add(E e) 向集合中添加元素，类型和泛型类型一致
 * public E get(int index) 根据索引获取元素，返回对应元素
 * public E remove(int index)  根据索引删除元素，返回删除的元素
 * public int size() 获取集合的长度，返回值是集合包含的元素个数
 *
 * 基本类型的包装类
 * byte         Byte
 * short        Short
 * int          Integer
 * long         Long
 * float        Float
 * double       Double
 * char         Character
 * boolean      Boolean
 * 自动装箱 ：基本类型--->引用类型
 *自动拆箱： 引用类型---->基本类型
 */

public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(100);
        list.add(99);
        list.add(1);
        list.add(12);
        list.add(20);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
