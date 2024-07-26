package coordinate.model;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24까지 입력 가능합니다.");
        }

        this.x = x;
        this.y = y;
    }

    public static Coordinate create(String input) {
        String[] split = input.split(",");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        return new Coordinate(x, y);
    }
}
