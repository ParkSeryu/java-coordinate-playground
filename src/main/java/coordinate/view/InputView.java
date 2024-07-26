package coordinate.view;

import java.util.Scanner;

public class InputView {
    public static final String prompt_msg = "좌표를 입력하세요.";
    public static final String revibeMsg = "다시 입력 해 주세요";
    private static Scanner scanner = new Scanner(System.in);

    public static String guide() {
        System.out.println(prompt_msg);
        return scanner.next();
    }

    public static void reVibe() {
        System.out.println(revibeMsg);
    }
}
