package cn.zqwzhao.array;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10) + 1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int length = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}
