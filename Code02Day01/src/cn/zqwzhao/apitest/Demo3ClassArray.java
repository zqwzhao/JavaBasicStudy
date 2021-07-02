package cn.zqwzhao.apitest;

/**
 * 对象数组
 */
public class Demo3ClassArray {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person p1 = new Person("李秋宇1",22);
        Person p2 = new Person("李秋宇2",23);
        Person p3 = new Person("李秋宇3",24);
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}
