package coordinate.view;

import java.util.Scanner;

public class InputView {
    public static final String prompt_msg = "좌표를 입력하세요.";
    private static Scanner scanner = new Scanner(System.in);

    public static String guide() {
        System.out.println(prompt_msg);
        return scanner.next();
    }

}
