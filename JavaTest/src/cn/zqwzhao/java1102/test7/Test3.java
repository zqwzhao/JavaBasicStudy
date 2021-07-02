package cn.zqwzhao.java1102.test7;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        switch (month) {
            case 1:
                day += 31;
            case 2:
                if(bissextile(year)) day +=29;

         }
    }


    private static boolean bissextile(int year) { //创建boolean类型的方法
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //平闰年判断算法
            return true;
        }else{
            return false;
        }
    }
}