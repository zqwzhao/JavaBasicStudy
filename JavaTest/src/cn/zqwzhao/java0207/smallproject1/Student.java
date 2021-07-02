package cn.zqwzhao.java0207.smallproject1;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021/2/7 16:39]
 */
public class Student {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        //this.studentSex = studentSex;
        setStudentSex(studentSex);
        setStudentAge(studentAge);
        //this.studentAge = studentAge;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        if (studentSex != "男" || studentSex != "女") {
            this.studentSex = "男";
        }
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if(studentAge <= 0 && studentAge > 100) {
            this.studentAge = 18;
        }
        this.studentAge = studentAge;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }


}
