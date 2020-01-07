package domain;

import java.util.ArrayList;

public class Check {
    final static int MAX_CHAR_NUMBER_OF_CAR_NAME = 5;
    final static int MIN_CHAR_NUMBER_OF_CAR_NAME = 1;
    private static ArrayList<Boolean> checkList;

    public static Boolean isCarNameError(String[] names) {
        checkList = new ArrayList<Boolean>();
        checkList.add(isCharNumberError(names));
        return checkList.contains(false);
    }

    public static Boolean isCharNumberError(String[] names) {
        for (String name : names) {
            if (name.length() > MAX_CHAR_NUMBER_OF_CAR_NAME
                    || name.length() < MIN_CHAR_NUMBER_OF_CAR_NAME){
                System.out.println("이름은 "+MIN_CHAR_NUMBER_OF_CAR_NAME+"자 이상 "+
                        MAX_CHAR_NUMBER_OF_CAR_NAME+"자 이하만 가능합니다.");
                return false;
            }
        }
        return true;
    }
}
