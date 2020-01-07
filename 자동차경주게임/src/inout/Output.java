package inout;

import java.util.ArrayList;

public class Output {
    public static ArrayList<String> printInputCarNameMessage(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Input.inputCarName();
    }

    public static int printInputRoundMessage(){
        System.out.println("시도할 횟수를 입력하세요.");
        return Input.inputRound();
    }
}
