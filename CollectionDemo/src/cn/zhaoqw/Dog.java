package cn.zhaoqw;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-07-06 21:55]
 */
public class Dog {
    private String name;
    private String variety;

    public Dog() {
    }

    public Dog(String name, String variety) {
        this.name = name;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
