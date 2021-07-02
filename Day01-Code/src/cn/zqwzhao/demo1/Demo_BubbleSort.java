package cn.zqwzhao.demo1;

import static cn.zqwzhao.demo1.Code01_BubbleSort.swap;

public class Demo_BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,2,6,9,10,20,1,66,11};
        BubbleSort(arr);
        for (int i : arr){
            System.out.print(i+"  ");
        }
    }

    private static void BubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i< arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j,j+1);

                }
            }
        }

    }

    public static void BubbleSort1(int[] arr) {

        int maxIndex;
        for(int i = 0; i < arr.length - 1; i++) {
            maxIndex = i;
            for (int j = 1; j < arr.length; j++) {
                if(arr[maxIndex] < arr[j]) maxIndex = j;
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

        }


    }

}
