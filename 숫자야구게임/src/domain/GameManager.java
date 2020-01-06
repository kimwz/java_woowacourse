package domain;

import player.Computer;
import player.User;

public class GameManager {
    private Computer computer = new Computer();
    private User user = new User();

    public void gameStart(){
        do {
            setting();
            gaming();
        } while (Input.isEnd() == 2);
    }

    public void setting(){
        computer.setNumber();
        computer.getNumber();
    }

    public void gaming(){
        user.setNumber();
        while (compare()[1]!=3){
            user.setNumber();
        }
    }

    public int[] compare(){
        int[] ballStrike = new int[2];
        ballStrike = Rule.ballStrike(computer.getNumber(),user.getNumber());
        return ballStrike;
    }
}
