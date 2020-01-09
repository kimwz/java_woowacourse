package domain;

import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Check {
    final static int ORDER_COUNT_MIN = 1;
    final static int ORDER_COUNT_MAX = 100;
    private List<Integer> FUNCTION_NUMBER_RANGE = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
    private List<Integer> TABLE_NUMBER_RANGE = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 5, 6, 8));
    private List<Integer> MENU_NUMBER_RANGE = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 21, 22));
    private ArrayList<Boolean> checkList = new ArrayList<Boolean>();

    public Boolean isInputFunctionError(String userInput) {
        checkList.add(isNumber(userInput));
        if (checkList.contains(false)) {
            OutputView.printIsNumberErrorMessage();
            return true;
        }
        checkList.add(isBetweenRange(userInput, FUNCTION_NUMBER_RANGE));
        return checkList.contains(false);
    }

    public Boolean isInputTableNumberError(String userInput) {
        checkList.add(isNumber(userInput));
        if (checkList.contains(false)) {
            OutputView.printIsNumberErrorMessage();
            return true;
        }
        checkList.add(isBetweenRange(userInput, TABLE_NUMBER_RANGE));
        return checkList.contains(false);
    }

    public Boolean isInputMenuNumberError(String userInput) {
        checkList.add(isNumber(userInput));
        if (checkList.contains(false)) {
            OutputView.printIsNumberErrorMessage();
            return true;
        }
        checkList.add(isBetweenRange(userInput, MENU_NUMBER_RANGE));
        return checkList.contains(false);
    }

    public Boolean isInputMenuCountError(String userInput) {
        checkList.add(isNumber(userInput));
        if (checkList.contains(false)) {
            OutputView.printIsNumberErrorMessage();
            return true;
        }
        checkList.add(isUnderHundred(userInput));
        return checkList.contains(false);
    }

    private Boolean isUnderHundred(String userInput) {
        int number = Integer.parseInt(userInput);
        if (number >= ORDER_COUNT_MIN && number <= ORDER_COUNT_MAX) {
            return true;
        }
        OutputView.printIsUnderHundredErrorMessage();
        return false;
    }

    private Boolean isNumber(String str) {
        String pattern = "^[0-9]+$";
        return str.matches(pattern);
    }

    private Boolean isBetweenRange(String userInput, List<Integer> range) {
        if (range.contains(Integer.parseInt(userInput))) {
            return true;
        }
        OutputView.printIsBetweenRangeErrorMessage(range);
        return false;
    }
}
