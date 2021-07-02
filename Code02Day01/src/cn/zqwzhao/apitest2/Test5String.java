package cn.zqwzhao.apitest2;

import java.util.Scanner;

/**
 * 输入一个字符串，统计其中各种字符出现的次数
 * 种类：大写字母，小写字母，数字，其他
 * <p>
 * 思路：
 * 1.既然用到键盘输入，Scanner
 * 2.定义四个变量，用来统计各种字符出现的次数
 * 3.将字符串转换成字符数组
 * 4.遍历char[] 字符数组统计各种字符出现的次数
 */
public class Test5String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                countUpper++;
            }if ('a' <= arr[i] && arr[i] <= 'z' ){
                countLower ++;
            }if('0' <= arr[i] && arr[i] <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字符：" + countUpper);
        System.out.println("小写字符：" + countLower);
        System.out.println("数字：" + countNumber);
        System.out.println("其他字符：" + countOther);

    }
}
