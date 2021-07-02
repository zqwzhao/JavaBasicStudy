package cn.zqwzhao.oopdemo1;

/**
 * @Auther: zqwzh
 * @Date: 2020/5/19 16:30
 * @Description:
 * @version:
 */
public class Demo1PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone("华为",2000,"蓝色");
        Phone two = new Phone("xiaomi",1999,"蓝色");

        System.out.println(one.toString());
        System.out.println(two.toString());


    }
}
