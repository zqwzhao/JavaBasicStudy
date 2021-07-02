package cn.zhaoqw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-02 16:07]
 *  Java 集合框架
 *  Collection ：存放单一值
 *      api方法:
 *          add : 要求必须传入的参数是Object对象，因此写入基本数据类型时，包含自动拆箱和自动装箱的过程
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(1.23);
        collection.add(true);
        collection.add("aaa");
        System.out.println(collection);
        //((ArrayList)collection).add(1,"bbb");

        Collection collection1 = new ArrayList();
        collection1.add("bbb");
        collection1.add("ccc");
        System.out.println(collection);
        collection.addAll(collection1);

        System.out.println(collection);
        Boolean bool = collection.containsAll(collection);
        Boolean bool2 = collection.contains("bbb");
        System.out.println(bool);
        System.out.println(bool2);

        collection1.clear();

        System.out.println(collection1.size());


        List<String> aaa = List.of("aaa", "bbb", "ccc");
        System.out.println(aaa);
    }
}
