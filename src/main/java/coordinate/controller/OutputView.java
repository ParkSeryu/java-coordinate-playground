package coordinate.controller;

public class OutputView {

    public static final String msg = "두 점 사이의 거리는 ";

    public static void printResult(double result) {
        System.out.print(msg);
        System.out.printf("%.6f", result);
    }
}
