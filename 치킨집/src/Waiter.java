
import domain.Order;
import view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;

public class Waiter {
    private static HashMap<Integer, ArrayList<Order>> orderSheet = new HashMap<Integer, ArrayList<Order>>();

    public static int getOrder(int tableNumber, Order order) {
        if (!orderSheet.containsKey(tableNumber)) {
            ArrayList<Order> orders = new ArrayList<Order>();
            orders.add(order);
            orderSheet.put(tableNumber, orders);
            return 0;
        }
        orderSheet.get(tableNumber).add(order);
        return 0;
    }

    public static int pay(int tableNumber) {
        if (!orderSheet.containsKey(tableNumber)) {
            OutputView.printPayErrorMessage(tableNumber);
            return 0;
        }
        OutputView.printOrderRecord(orderSheet.get(tableNumber));
        OutputView.printPayMessage(tableNumber, orderSheet.get(tableNumber));
        orderSheet.remove(tableNumber);
        return 0;
    }

    public static HashMap<Integer, ArrayList<Order>> getOrderSheet(){
        return orderSheet;
    }
}
