package domain;

import player.Computer;
import player.User;

public class GameManager {
    private Computer computer = new Computer();
    private User user = new User();

    public void gameStart(){
        computer.setNumber();
        computer.getNumber();
        user.setNumber();
        user.getNumber();
    }
}
