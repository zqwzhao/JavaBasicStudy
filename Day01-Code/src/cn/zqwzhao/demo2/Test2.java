package cn.zqwzhao.demo2;

/**
 * 有一个八层高的灯塔，每层的灯的数量都是上一层的两倍
 * 一共 756层灯塔 求塔底灯数
 * 分析： 第一层 1
 *       第二层 2
 *       第三层 4
 *
 *  1. n 每层的灯数
 *    sum 前七层总灯数
 *  2.塔底灯数 = 756 - sum
 */
public class Test2 {
    public static void main(String[] args) {
        int i, n, sum;
        for (i = n = sum = 1; i <= 7;i++){
            n = n * 2;
            sum += n;
        }
        System.out.println(756-sum);
    }

}
