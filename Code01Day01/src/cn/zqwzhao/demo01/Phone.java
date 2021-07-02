package cn.zqwzhao.demo01;
/*
*
*成员变量(属性)
* brand 品牌
* price 价格
* color 颜色
*成员方法(行为)
*
* call 打电话
* sendMeseage 发信息
*
* */
public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Phone(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
