package cn.zqwzhao.array;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {20,30,19,12,100};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr2, arr2.length + 2);
        System.out.println(Arrays.toString(arr3));
    }
}
