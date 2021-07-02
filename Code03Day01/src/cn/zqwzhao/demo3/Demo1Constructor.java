package cn.zqwzhao.demo3;

/**
 * 继承关系中父子类构造方法的访问特点
 * 1.子类构造方法中有一个默认的“super()“调用，不写默认给一个, 然后执行子类构造
 * 2.子类构造可以通过super关键字调用父类重载构造
 * 3.super的父类构造调用必须是子类构造的第一条语句 ，super只能使用一次
 *
 * super关键字的用法一共有三种
 * 1.在子类的成员方法中，访问父类的成员变量
 * 2.在子类的成员方法中，调用父类的成员方法
 * 3.在子类的构造方法中，访问父类的构造方法
 *
 */
public class Demo1Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }

}
