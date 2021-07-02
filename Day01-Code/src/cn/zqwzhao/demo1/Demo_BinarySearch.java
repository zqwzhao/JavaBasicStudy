package cn.zqwzhao.demo1;

import java.util.Scanner;

public class Demo_BinarySearch {

    public static void main(String[] args) {
        int[] arr={200,5,71,9,11,101,15,20,100,101,299,120,188,14,201};
        bubbleSort1(arr);
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = binarySearch(arr,target);

        System.out.println(result);

    }

    private static void bubbleSort1(int[] arr) {
        for (int i = 0 ; i < arr.length-1; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

    }

    private static int binarySearch(int[] arr,int target) {
        int left = 0,right = arr.length -1 ;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid + 1;
            }else if(arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        //返回0表示没找到
        return 0;
    }

}
