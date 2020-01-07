package domain;

import inout.Output;

import java.util.ArrayList;

public class GameManager {
    private ArrayList<Car> carList = new ArrayList<Car>();
    private int roundNumber;

    public void gameStart(){
        init();
        run();
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
            stayOrGo();
            Output.printGameRun(carList);
        }
    }

    public void stayOrGo(){
        for(Car car:carList){
            if(Dice.makeRandomNumber()>3){
                car.go();
            }
        }
    }

    public void getCarName(){
        for(Car car:carList){
            System.out.println(car.getName());
        }
    }

    public void getRound(){
        System.out.println(roundNumber);
    }
}
