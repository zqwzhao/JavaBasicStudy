package cn.zqwzhao.java0207.smallproject1;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021/2/7 16:31]
 */
public class Subject {
    private String subjectName;
    private String subjectNum;
    private int subjectLife;
    public Subject() {
        super();
    }

    public Subject(String subjectName, String subjectNum, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNum = subjectNum;
        //this.subjectLife = subjectLife;
        setSubjectLife(subjectLife);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(String subjectNum) {
        this.subjectNum = subjectNum;
    }

    public int getSubjectLife() {

        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if(subjectLife <= 0) {
            return ;
        }
        this.subjectLife = subjectLife;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectNum='" + subjectNum + '\'' +
                ", subjectLife=" + subjectLife +
                '}';
    }
}
