package cn.zqwzhao.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 0;
        Scanner sc = new Scanner(System.in);

        //一直输入数字遇到负数结束
        while(true) {
            arr[index]  = sc.nextInt();
            if (arr[index] < 0) {
                break;
            }

            //数组不够长的时候，扩容】
            if (++index > arr.length - 1) {
                arr = Arrays.copyOf(arr,arr.length + arr.length / 2);
            }
        }

        sc.close();
        System.out.println(Arrays.toString(arr));


        int sum = 0;
        int amount = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) break;
            sum += arr[i];
            amount++;
        }

        System.out.println(sum / amount);
    }
}
