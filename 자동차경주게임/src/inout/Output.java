package inout;

import domain.Car;
import domain.Dice;

import java.util.ArrayList;

public class Output {
    public static ArrayList<String> printInputCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Input.inputCarName();
    }

    public static int printInputRoundMessage() {
        System.out.println("시도할 횟수를 입력하세요.");
        return Input.inputRound();
    }

    public static void printGameRun(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.print(car.getName() + " : " + printPositionLevel(car.getPosition()));
            System.out.println();
        }
        System.out.println();
    }

    public static String printPositionLevel(int position) {
        return new String(new char[position]).replace("\0", "-");
    }

    public static void printAward(ArrayList<String> winners) {
        String winner = String.join(",",winners);
        System.out.println(winner+" 가 우승했습니다.");
    }
}
