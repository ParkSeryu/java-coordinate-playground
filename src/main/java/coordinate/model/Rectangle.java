package coordinate.model;

import java.util.List;

public class Rectangle implements Figure {
    private final List<Point> points;

    public Rectangle(List<Point> points) {
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
        double maxX = Double.NEGATIVE_INFINITY;
        double minX = Double.POSITIVE_INFINITY;
        double maxY = Double.NEGATIVE_INFINITY;
        double minY = Double.POSITIVE_INFINITY;

        for (Point point : points) {
            minX = point.returnMinX(minX);
            maxX = point.returnMaxX(maxX);
            minY = point.returnMinY(minY);
            maxY = point.returnMaxY(maxY);
        }

        return (maxX - minX) * (maxY - minY);
    }
}
