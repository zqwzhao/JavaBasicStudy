package cn.zqwzhao.demo2;


/**
 * 重写(Override)
 * 概念： 在继承关系中，方法名称一样，参数列表也一样
 *
 * 重写(Override)和重载(Overload)
 * 1.重写(Override)方法名称一样，参数列表【也一样】 覆盖、覆写 【覆盖重写】
 * 2.重载(Overload)方法名称一样，参数列表【不一样】
 *
 * 方法的覆盖重写的特点：创建的是子类对象，则优先用子类方法
 *
 * 方法覆盖重写的注意事项：
 * 1.必须保证父类和子类的方法名称相同，参数列表相同
 * 2.子类方法的返回值必须小于等于父类方法的范围
 * 比如父类 返回值类型为Object 则 子类的可以是 Object 或者是它的子类
 * 3.子类方法的权限必须大于等于父类的权限修饰符
 * public  > protected > (default) 留空  > private
 *
 */
public class Demo1Override {
}
