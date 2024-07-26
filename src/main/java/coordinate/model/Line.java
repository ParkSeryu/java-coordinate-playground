package coordinate.model;

import java.util.List;

public class Line implements Figure{
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    public void create(String[] input) {
        for (String str : input) {
            Point point = Point.create(str);
            points.add(point);
        }
    }

    @Override
    public double calculate() {
        Point pointX = points.get(0);
        Point pointY = points.get(1);
        return Math.sqrt(Math.pow((pointX.getX() - pointY.getX()), 2) + Math.pow(
                (pointX.getY() - pointY.getY()), 2));
    }

    public boolean isSize(int size) {
        return points.size() == size;
    }
}
