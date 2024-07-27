package coordinate.model;

import java.util.Arrays;
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
        double a = new Line(Arrays.asList(points.get(0), points.get(1))).calculate();
        double b = new Line(Arrays.asList(points.get(0), points.get(2))).calculate();
        double c = new Line(Arrays.asList(points.get(1), points.get(2))).calculate();
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
