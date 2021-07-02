package cn.zqwzhao.demo4;

/**
 * 抽象方法：就是加上abstract关键字，不写大括号直接分号结束
 * 抽象类：抽象方法所在的类必须是抽象类
 *
 * 如何使用抽象方法和抽象类
 * 1.不能直接new抽象类
 * 2.必须由一个子类继承这个抽象类
 * 3.子类必须覆盖重写抽象父类中的所有抽象方法
 * 4.创建子类对象使用
 */
public abstract class Animal {
    public abstract void eat();

    public void method() {

    }
}
