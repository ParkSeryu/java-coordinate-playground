package coordinate.model;

import java.util.List;

public class Line {
    private final List<Coordinate> coordinates;

    public Line(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public void create(String input) {
        String cleanedInput = input.replaceAll("[()]", "");
        String[] splitStr = cleanedInput.split("-");
        for (String str : splitStr) {
            Coordinate coordinate = Coordinate.create(str);
            coordinates.add(coordinate);
        }
    }

    public double calculate() {
        Coordinate coordinateX = coordinates.get(0);
        Coordinate coordinateY = coordinates.get(1);
        return Math.sqrt(Math.pow((coordinateX.getX() - coordinateY.getX()), 2) + Math.pow(
                (coordinateX.getY() - coordinateY.getY()), 2));
    }

    public boolean isSize(int size) {
        return coordinates.size() == size;
    }
}
