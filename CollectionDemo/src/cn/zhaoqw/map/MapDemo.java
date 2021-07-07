package cn.zhaoqw.map;

import java.util.*;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-07 15:33]
 *
 *
 * Map 存储的是K-V键值对数据
 *      实现子类：
 *          HashMap： 数据+链表(1.7) 数组+链表+红黑数(1.8+)
 *          LinkedHashMap: 链表
 *          TreeMap： 红黑树
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("f",1);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("a"));
        System.out.println(map.size());
        System.out.println(map.containsValue(1));
        System.out.println(map.get("b"));

        //遍历操作
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string);
        }

        Collection<Integer> values = map.values();
        for(Integer i : values) {
            System.out.println(i);
        }
        System.out.println("=======================");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry:entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
