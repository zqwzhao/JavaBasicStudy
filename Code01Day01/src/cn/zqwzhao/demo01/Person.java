package cn.zqwzhao.demo01;

/*
* 1.用private修饰成员变量，成员变量
* 只能在本类中使用，超过本类就不能直接访问
*
* 2.this "通过谁掉用的方法，this就是谁"
*
* 3.构造方法： new对象时，调用的就是构造方法
* (1)构造方法名称必须和所在类名一致
* (2)构造方法不要写返回值，练void都不用谢
*   例如Person类
*   public Person(){};
* (3)构造方法不能返回一个具体的返回值
* (4)如果没有编写构造方法，编译器会自动添加一个无参构造方法
* (5)一旦编写了至少一个构造方法，编译器则不会自动添加构造方法
* (6)构造方法也可以进行重载
*  重载：方法名相同，参数列表不同

* 编写标准的 Java bean类
* (1)成员变量用private修饰
* (2)为每一个成员变量编写getter和setter方法
* (3)编写无参构造方法
* (4)编写全参构造方法
*  */
public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(int age) {
        this.name = null;
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
