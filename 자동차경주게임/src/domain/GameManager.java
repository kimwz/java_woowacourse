package domain;

import inout.Output;

import java.util.ArrayList;

public class GameManager {
    final static int MIN_DICE_NUMBER_TO_MOVE = 4;
    private ArrayList<Car> carList = new ArrayList<Car>();
    private int roundNumber;

    public void gameStart(){
        init();
        run();
        award();
    }

    public void init(){
        setCar(Output.printInputCarNameMessage());
        setRound(Output.printInputRoundMessage());
    }

    public void setCar(ArrayList<String> carNames){
        for(String name :carNames){
            carList.add(new Car(name));
        }
    }

    public void setRound(int roundNumber){
        this.roundNumber = roundNumber;
    }

    public void run(){
        System.out.println("실행 결과");
        for (int i=0;i<roundNumber;i++){
            stayOrMove();
            Output.printGameRun(carList);
        }
    }

    public void stayOrMove(){
        for(Car car:carList){
            if(Dice.makeRandomNumber()>=MIN_DICE_NUMBER_TO_MOVE){
                car.move();
            }
        }
    }

    public void award(){
        Output.printAward(Winner.getWinners(carList));
    }
}
