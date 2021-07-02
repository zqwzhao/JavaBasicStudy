package cn.zqwzhao.java1102.test7;

import java.util.Scanner;

public class MaxAndMinTest {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }

        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("max: " + getMax(arr));
        System.out.println("min: " + getMin(arr));
    }
}
