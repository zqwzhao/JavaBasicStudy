package cn.zqwzhao.demo01;
/*
* 当我们把对象名作为参数或者给另一对象附初始值时,传递的是【地址】
*
* 局部变量和成员变量的区别【重点】
* 1.定义位置不一样
* 局部变量：在方法的内部
* 成员变量：在方法的外部，直接写在类中
*
* 2.作用范围一样
*局部变量：只有在方法当中才能使用，出了方法就不能再用
*成员变量：整个类都可以使用
*
* 3.默认值不一样
* 局部变量：没有默认值，如果需要使用，必须手动赋值
* 成员变量：如果没有赋值，会有默认值，规则和数组一样
*
* 4.内存位置不一样(了解)
* 局部变量：位于栈内存
* 成员变量：位于堆内存
*
* 5. 生命周期不一样
* 局部变量：随着方法进栈而产生，随着方法出栈而消失
* 成员变量：随着对象的创建而产生，对着对象被垃圾回收而消失
* */
public class Demo01 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("华为",2399,"蓝色");
        System.out.println(phone1.getBrand()+phone1.getColor()+phone1.getPrice());
        System.out.println(phone1.toString());
        phone1.call("李秋宇");

    }
}
