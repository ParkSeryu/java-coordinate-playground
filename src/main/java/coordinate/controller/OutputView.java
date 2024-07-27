package coordinate.controller;

public class OutputView {

    public static void printResult(String name, double result) {
        System.out.print(name);
        System.out.printf("%.6f", result);
    }
}
