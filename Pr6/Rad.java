package Pr6;

import static java.lang.Math.*;
import java.lang.*;
import java.util.Scanner;

public class Rad {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(3.1,4.1, 5.1, "\u201c");
        System.out.println("Длинна окружности = " + k1.getLength() + " см\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        r = scanner.nextDouble();
        k1.setR(r);
        System.out.println("Длина окружности = " + k1.getLength() + "см" );

}
static class Circle {
    private double x, y, r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

        public Circle(double x, double y ,double r, String colour ) {
            this.y = y;
            this.x = x;
            this.r = r;
            this.colour = colour;
        }
        @Override
        public String toString(){
        return "Circle{" + "x=" + x + ", y=" + y + ", r=" + r + ", colour" + colour + '\'' + '}';
        }
        public double getLength(){
        double c;
        c = 2 * PI*r;
        return c;
        }
    }
}