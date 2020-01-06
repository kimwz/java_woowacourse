package domain;

import player.Computer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Check {
    final static ArrayList<Integer> endingExample = new ArrayList<Integer>(Arrays.asList(1,2));
    private static ArrayList<Boolean> checkList;


    public static Boolean isUserNumberError(String inputNumber){
        checkList = new ArrayList<Boolean>();
        if (!isInt(inputNumber)){
            return true;
        }
        checkList.add(isCollectDigitNumber(inputNumber));
        checkList.add(isNotContainZero(inputNumber));
        checkList.add(isNotRepeatedNumber(inputNumber));
        return checkList.contains(false);
    }

    public static Boolean isInputEndingError(String userInput){
        checkList = new ArrayList<Boolean>();
        if (!isInt(userInput)){
            return true;
        }
        checkList.add(isOneOrTwo(userInput));
        return checkList.contains(false);
    }

    public static Boolean isInt(String inputNumber){
        String pattern = "^[0-9]+$";
        if (inputNumber.matches(pattern)){
            return true;
        }
        System.out.println("숫자만 입력하세요");
        return false;
    }

    public static Boolean isCollectDigitNumber(String inputNumber){
        if (inputNumber.length() == Computer.getDigitOfNumber()){
            return true;
        }
        System.out.println(Computer.getDigitOfNumber()+"자리의 숫자를 입력하세요.");
        return false;
    }

    public static Boolean isNotContainZero(String inputNumber){
        String pattern = "^[1-9]+$";
        if (inputNumber.matches(pattern)){
            return true;
        }
        System.out.println("1 이상 9 이하의 숫자를 입력하세요.");
        return false;
    }

    public static Boolean isOneOrTwo(String inputNumber){
        if (endingExample.contains(Integer.parseInt(inputNumber))){
            return true;
        }
        System.out.println("1 또는 2 를 입력하세요.");
        return false;
    }

    public static Boolean isNotRepeatedNumber(String inputNumber){
        Set<Integer> set = new HashSet<Integer>();
        for (int number:Input.intoList(inputNumber)){
            set.add(number);
        }
        if (set.size() == inputNumber.length()){
            return true;
        }
        System.out.println("중복되지 않는 숫자를 입력하세요.");
        return false;
    }
}
