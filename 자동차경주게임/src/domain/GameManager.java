package domain;

import inout.Output;

import java.util.ArrayList;

public class GameManager {
    private ArrayList<Car> carList = new ArrayList<Car>();
    private int roundNumber;

    public void gameStart(){
        init();
    }

    public void init(){
        setCar(Output.printInputCarNameMessage());
        setRound();
    }

    public void setCar(ArrayList<String> carNames){
        for(String name :carNames){
            carList.add(new Car(name));
        }
    }

    public void setRound(){

    }

    public void getCarName(){
        for(Car car:carList){
            System.out.println(car.getName());
        }
    }
}
