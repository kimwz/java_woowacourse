package domain;

import java.util.ArrayList;

public class Check {
    final static int MAX_CHAR_NUMBER_OF_CAR_NAME = 5;
    final static int MIN_CHAR_NUMBER_OF_CAR_NAME = 1;
    final static int MIN_ROUND_NUMBER = 1;
    private static ArrayList<Boolean> checkList;

    public static Boolean isCarNameError(String[] names) {
        checkList = new ArrayList<Boolean>();
        checkList.add(isCharNumberError(names));
        return checkList.contains(false);
    }

    public static Boolean isCharNumberError(String[] names) {
        for (String name : names) {
            if (name.length() > MAX_CHAR_NUMBER_OF_CAR_NAME
                    || name.length() < MIN_CHAR_NUMBER_OF_CAR_NAME) {
                System.out.println("이름은 " + MIN_CHAR_NUMBER_OF_CAR_NAME + "자 이상 " +
                        MAX_CHAR_NUMBER_OF_CAR_NAME + "자 이하만 가능합니다.");
                return false;
            }
        }
        return true;
    }

    public static Boolean isInputRoundError(String round) {
        checkList = new ArrayList<Boolean>();
        checkList.add(isInt(round));
        if (!checkList.contains(false)) {
            checkList.add(isOverOne(round));
        }
        return checkList.contains(false);
    }

    public static Boolean isInt(String round) {
        String pattern = "^[0-9]+$";
        if (!round.matches(pattern)) {
            System.out.println("숫자만 입력하세요.");
            return false;
        }
        return true;
    }

    public static Boolean isOverOne(String round) {
        if (Integer.parseInt(round) < MIN_ROUND_NUMBER){
            System.out.println(MIN_ROUND_NUMBER+" 이상의 수를 입력하세요.");
            return false;
        }
        return true;
    }
}
