package domain;

import java.util.ArrayList;

import static domain.Category.*;

public class Calculate {
    public static int CalculatePrice(ArrayList<Order> orderList) {
        int finalPrice = 0;
        int chickenCount = 0;
        for (Order order : orderList) {
            if (order.getCategory() == CHICKEN) {
                chickenCount += order.getCount();
            }
            finalPrice += order.getPrice();
        }
        return finalPrice - ((int) chickenCount / 10) * 10000;
    }
}
