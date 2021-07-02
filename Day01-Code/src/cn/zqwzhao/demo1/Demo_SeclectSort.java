package cn.zqwzhao.demo1;

public class Demo_SeclectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 6, 9, 10, 20, 1, 66, 11};
        SeclectSort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    private static void SeclectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int maxIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            int temp;
            temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

    }


}
