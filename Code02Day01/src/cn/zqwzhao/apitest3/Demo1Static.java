package cn.zqwzhao.apitest3;

/**
 * static 修饰成员变量，则这个成员变量属于这个类，不单单属于某个对象，多个对象共享一份数据
 * static 修饰成员方法，方法变成了静态方法，静态方法属于类，可以用对象点调用
 *
 * 注意：
 * 1.静态不能直接访问非静态
 * 2.静态不能用this
 * 原因：内存中是先静态后非静态
 * 静态全程和类有关，和对象无关
 *
 * 静态代码块
 */
public class Demo1Static {

    /*
    静态优先于非静态执行
    静态代码块用来一次性给静态成员变量赋值
     */
    static{
        //内容
        System.out.println("静态代码块");
    }
    Demo1Static(){
        System.out.println("构造");
    }

    public static void main(String[] args) {
                Demo1Static ds1 = new Demo1Static();
    }
}
