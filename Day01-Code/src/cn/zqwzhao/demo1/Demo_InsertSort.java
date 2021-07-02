package cn.zqwzhao.demo1;

public class Demo_InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,44,21,6,9,10,20,1,66,11};
        InsertSort(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    private static void InsertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;

            }
            arr[preIndex + 1] = current;
        }
    }
}
