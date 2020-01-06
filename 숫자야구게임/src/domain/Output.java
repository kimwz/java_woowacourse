package domain;

import java.util.ArrayList;

public class Output {
    public static ArrayList<Integer> outputInputNumberMessage(){
        System.out.println("숫자를 입력해주세요.");
        //예외 검사
        return Input.inputUserNumber();
    }
}
