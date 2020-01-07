package domain;

import java.util.ArrayList;

public class Winner {
    private static ArrayList<String> winners = new ArrayList<String>();

    public static void setWinners(ArrayList<Car> carList) {
        for (Car car : carList) {
            if (car.getPosition() == getMaxPosition(carList)) {
                winners.add(car.getName());
            }
        }
    }

    public static int getMaxPosition(ArrayList<Car> carList) {
        int maxPosition = 0;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public static ArrayList<String> getWinners(ArrayList<Car> carList) {
        setWinners(carList);
        return winners;
    }
}
