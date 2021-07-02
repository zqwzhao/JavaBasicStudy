package cn.zqwzhao.demo1;

/**
 * 继承 extends 子类继承父类的方法
 * 继承遵从一个关系 is-a 比如 老师是一个员工
 *
 * 1.直接通过子类对象访问成员变量
 *  等号左边是谁，就优先用谁，，没有就向上找
 * 2.间接通过成员变量访问成员变量
 *   该方法属于谁就优先用谁，没有就向上找
 *
 *
 * 访问变量
 *  局部变量 ：直接用
 *  子类用自己的成员变量 ： this.成员变量
 *  子类用父类的成员变量： super.成员变量
 *
 *  访问成员方法
 *  创建的对象是谁，就优先用谁，如果没有都是往上找，不会往下找
 *
 */
public class Teacher extends Employee {
    int num = 200;
    int numZi = 20;
    public static void main(String[] args) {
        Employee em = new Teacher();
        System.out.println(em.numFu);
        System.out.println("-------------");

        Teacher te = new Teacher();
        System.out.println(te.numFu);
        System.out.println(te.numZi);
        System.out.println(te.num);
        te.methodZi();
        te.methodFu();
    }

    public void methodZi() {
        System.out.println("子类方法执行"+num);
    }
}
