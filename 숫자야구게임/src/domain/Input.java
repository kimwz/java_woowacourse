package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> inputUserNumber() {
        String inputNumber = scanner.next();
        Check.checkUserNumber(inputNumber);
        return intoList(inputNumber);
    }

    public static ArrayList<Integer> intoList(String input) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            result.add(Integer.parseInt(input.split("")[i]));
        }
        return result;
    }

    public static int isEnd() {
        String userInput = scanner.next();
        //예외 체크
        return Integer.parseInt(userInput);
    }
}
