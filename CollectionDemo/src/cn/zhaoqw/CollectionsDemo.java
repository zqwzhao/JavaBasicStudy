package cn.zhaoqw;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-06 22:13]
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list,"adfg","bdfg","fgdc","dfs");
        System.out.println(list);

        //list.sort((str1,str2) -> str1.length()-str2.length());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (str1,str2) -> {
            int res = str1.length() - str2.length();
            if (res > 0) {
                return 1;
            }else if (res < 0) {
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(Collections.binarySearch(list,"dfs"));
    }
}
