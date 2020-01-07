package inout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private final static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> inputCarName(){
        String names = scanner.next();
        //예외 검사
        return new ArrayList<String>(Arrays.asList(names.split(",")));
    }

    public static int inputRound(){
        String round = scanner.next();
        //예외 검사
        return Integer.parseInt(round);
    }
}
