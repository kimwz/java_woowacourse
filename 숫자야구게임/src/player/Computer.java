package player;

import java.util.ArrayList;
import java.util.Random;

public class Computer {
    final static int DIGIT_OF_NUMBER = 3;
    protected ArrayList<Integer> number;

    public void setNumber() {
        number = new ArrayList<Integer>();
        Random random = new Random();
        while (number.size() < DIGIT_OF_NUMBER) {
            int randomNumber = random.nextInt(9) + 1;
            if (!number.contains(randomNumber)) {
                number.add(randomNumber);
            }
        }
    }

    public ArrayList<Integer> getNumber(){
        return number;
    }
}
