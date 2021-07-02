package cn.itcast.demo1;

/*
    求一个数列的值
    f0 = 1
    f1 = 4
    f(n+2) = nf(n+1)  + f(n+2)
 */
public class Demo01Recursive {

    // 非递归方法解决
    public static int fn1(int n) {
        int f0 = 1;
        int f1 = 4;
        int result = 0;
        if (n == 0) result = f0;
        else  if (n == 1) result = f1;
        else {
            for (int i = 2; i <= n; i++) {
                result = 2 * f1 + f0;
                f0 = f1;
                f1 = result;
            }
        }

        return result;
    }


    // 递归方法解决
    public static int fn2(int n) {

        if (n == 0) return 1;
        else if (n == 1) return 4;
        else {
            return 2 * fn2(n - 1) + fn2( n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn1(10));
        System.out.println( fn2(10));
    }
}
