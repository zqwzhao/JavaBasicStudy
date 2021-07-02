package cn.zqwzhao.apitest3;


import java.util.Arrays;

/**
 * java.util.Arrays 里面有一些很好用的静态成员方法
 *
 * public static String toString(数组) 将参数变成字符串
 * public static void  sort(数组) 给数组排序 默认升序从小到大
 * 备注
 * 1.如果是数值，sort按值从小到大 升序
 * 2.字符串 ，按照字母升序
 * 3，如果是自定义类，那么这个类需要Compareable 或者Compareator接口
 */
public class Demo2Arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{10,5,1,55,66,99,100,11,45,77,88};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
