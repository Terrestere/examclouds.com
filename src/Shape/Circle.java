package Shape;

import java.awt.*;

public class Circle extends Shape {
    private int x;
    private int y;
    private int h;

    public Circle() {
    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(Color color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) {
            return false;
        }
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
