package domain;

import java.util.ArrayList;

import static domain.Category.*;

public class Calculate {
    final static int DISCOUNT_CHICKEN_PRICE = 10000;
    final static int MIN_COUNT_TO_DISCOUNT = 10;
    
    public static int CalculatePrice(ArrayList<Order> orderList) {
        int finalPrice = 0;
        int chickenCount = 0;
        for (Order order : orderList) {
            if (order.getCategory() == CHICKEN) {
                chickenCount += order.getCount();
            }
            finalPrice += order.getPrice();
        }
        return finalPrice - ((int) chickenCount / MIN_COUNT_TO_DISCOUNT) * DISCOUNT_CHICKEN_PRICE;
    }
}
