package cn.zqwzhao.array;

/**
 * 数组元素反转
 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,33,22,200,199,300};
        getReverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("最大值" + getMax(arr));
    }

    /*
    数组元素反转
    函数名：
    返回值
    参数列表
    */
    public static void getReverse(int[] arr) {
        int max = arr.length - 1;
        int min = 0, temp;
        while (min < max) {
            temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }
    }

    //求数组最大值
    public static int getMax(int[] arr) {
        int Max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }
}
