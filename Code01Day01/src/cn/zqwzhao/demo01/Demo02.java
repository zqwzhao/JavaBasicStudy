package cn.zqwzhao.demo01;
/*
* 面向对象三大特性：继承 多态 封装
*
* 封装性在Java中的体现：
* 1.方法是一种封装
* 2.关键字private是一种封装形式
*
* 封装:具体实现的隐藏
* */


public class Demo02 {
    public static void main(String[] args) {
        int[] arr={10,15,20,25,30};
        int max=getMax(arr);
        System.out.println(max);

    }

    private static int getMax(int[] arr) {

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
