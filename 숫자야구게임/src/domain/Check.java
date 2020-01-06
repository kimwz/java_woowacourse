package domain;

public class Check {
    public static void checkUserNumber(String inputNumber){
        if (!isInt(inputNumber)){
            System.out.println("숫자만 입력하세요.");
        } else if ()
    }

    public static Boolean isInt(String inputNumber){
        String pattern = "^[0-9]+$";
        return inputNumber.matches(pattern);
    }
}
