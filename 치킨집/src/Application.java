
import view.InputView;


public class Application {
    public static void main(String[] args) {
        int functionNumber;
        functionNumber = InputView.inputFunction();
        while (functionNumber != 3){
            if (functionNumber == 1){
                Waiter.getOrder(InputView.inputTableNumber(1, Waiter.getOrderSheet()),InputView.inputMenus());
                functionNumber = InputView.inputFunction();
                continue;
            }
            Waiter.pay(InputView.inputTableNumber(2,Waiter.getOrderSheet()));
            functionNumber = InputView.inputFunction();
        }
        System.exit(0);
    }
}
