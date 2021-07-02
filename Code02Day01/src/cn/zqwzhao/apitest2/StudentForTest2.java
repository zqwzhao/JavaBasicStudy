package cn.zqwzhao.apitest2;

public class StudentForTest2 {
    private String name;
    private int age;

    public StudentForTest2() {
    }

    public StudentForTest2(String name, int age) {
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

    @Override
    public String toString() {
        return "StudentForTest2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
