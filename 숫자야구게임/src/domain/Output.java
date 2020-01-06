package domain;

import java.util.ArrayList;

public class Output {
    public static ArrayList<Integer> outputInputNumberMessage() {
        System.out.println("숫자를 입력해주세요.");
        return Input.inputUserNumber();
    }

    public static void outputBallStrike(int[] ballStrike) {
        if (ballStrike[1] == 3) {
            System.out.println("3스크라이크\n3개의 숫자를 모두 맞히셨습니다.");
            System.out.println("게임을 종료하려면 1, 새로운 게임을 시작하려면 2 를 입력하세요.");
        } else if (ballStrike[0] == 0 && ballStrike[1] == 0) {
            System.out.println("낫싱");
        } else if (ballStrike[0] != 0) {
            System.out.print(ballStrike[0] + "볼 ");
            if (ballStrike[1] != 0) {
                System.out.println(ballStrike[1] + "스트라이크");
            }
            System.out.println("\n");
        }
    }
}
