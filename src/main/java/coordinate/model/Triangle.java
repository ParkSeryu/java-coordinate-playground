package coordinate.model;

import java.util.List;

public class Triangle implements Figure{
    private final List<Point> points;

    public Triangle(List<Point> points) {
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
        return 0;
    }
}
