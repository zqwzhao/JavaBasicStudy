package cn.zqwzhao.demo2;

/**
 * 求数列 2/3 , 4/5 , 6/9 ,  10/15 的前n项和
 */
public class Test1 {
    public static void main(String[] args) {
        float i, m, n, temp, sum = 0;
        for (i = n = 1, m = 2; i < 30; i++) {
            temp = m;
            m = n + 1;
            n = temp + n;
            sum += m/n;
        }

        System.out.println(sum);
    }
}
