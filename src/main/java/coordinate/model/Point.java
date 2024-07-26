package coordinate.model;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24까지 입력 가능합니다.");
        }

        this.x = x;
        this.y = y;
    }

    public static Point create(String input) {
        String[] split = input.split(",");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double returnMinX(double num){
        return Math.min(this.x, num);
    }


    public double returnMaxX(double num){
        return Math.max(this.x, num);
    }


    public double returnMinY(double num){
        return Math.min(this.y, num);
    }


    public double returnMaxY(double num){
        return Math.max(this.y, num);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point that = (Point) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
