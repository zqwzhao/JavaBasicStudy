package cn.zqwzhao.java1102.test7;

public class CircleTest {
    public static void main(String[] args) {
        System.out.printf("%.2f\n",Circle.getPerimeter(6));
        System.out.printf("%.2f\n",Circle.getPerimeter(3.5));
        System.out.printf("%.2f\n",Circle.getPerimeter(58.6));
        System.out.println("====================");

        System.out.printf("%.2f\n",Circle.getArea(6));
        System.out.printf("%.2f\n",Circle.getArea(3.5));
        System.out.printf("%.2f\n",Circle.getArea(58.6));

    }

}

class Circle {
    public static double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
    public static double getArea(double radius) {
        return Math.PI * radius *radius;
    }
}
