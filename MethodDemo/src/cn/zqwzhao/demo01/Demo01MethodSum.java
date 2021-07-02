package cn.zqwzhao.demo01;

/**
 * @Auther: zqwzh
 * @Date: 2020/5/17 12:37
 * @Description:求 1-n 数字的和
 * @version:
 */
public class Demo01MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }


    /**
     * 方法的三要素: 返回值 方法名称 参数列表
     * @param n
     * @return
     */
    public static int getSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
