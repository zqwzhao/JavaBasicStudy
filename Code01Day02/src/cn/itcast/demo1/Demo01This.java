package cn.itcast.demo1;

/*
    this 代表当前类的实例，谁调用的方法，this就是谁

 */
public class Demo01This {
    public int age;
    public Demo01This grow() {
        age++;
        return this;
    }

    public static void main(String[] args) {
        Demo01This rt = new Demo01This();
        rt.grow().grow();
        System.out.println("rt的age值："+rt.age);
    }
}
