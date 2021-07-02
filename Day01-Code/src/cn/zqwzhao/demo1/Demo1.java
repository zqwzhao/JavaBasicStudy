package cn.zqwzhao.demo1;


/*
*
* leedcode 11 题 盛水最多的容器
* */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea2(arr));
    }

    public static int maxArea(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int area = (j - i) * Math.min(arr[i], arr[j]);
                max = Math.max(area, max);
            }
        }
        return max;
    }

    public static int maxArea2(int[] arr) {
        int max = 0;
        for (int i = 0, j = arr.length - 1; i < j; ) {
            int minHeight = arr[i] > arr[j] ? arr[j--] : arr[i++];
            int area = (j - i + 1) * minHeight;
            max = Math.max(area, max);
        }
        return max;

    }
}
