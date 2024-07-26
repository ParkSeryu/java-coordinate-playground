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
}
