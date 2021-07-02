package cn.zqwzhao.apitest2;


import java.util.ArrayList;

/**
 * 定义4个学生学生对象，添加到集合并遍历
 */

public class Test2Student {
    public static void main(String[] args) {
        ArrayList<StudentForTest2> list = new ArrayList<>();
        StudentForTest2 stu1 = new StudentForTest2("李秋宇",21);
        StudentForTest2 stu2 = new StudentForTest2("任唱",22);
        StudentForTest2 stu3 = new StudentForTest2("秦凯达",23);
        StudentForTest2 stu4 = new StudentForTest2("赵庆武",22);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for(StudentForTest2 student : list) {
            System.out.println(student.toString());
        }



    }
}
