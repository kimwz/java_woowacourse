package view;

import domain.Check;
import domain.Menu;
import domain.MenuRepository;
import domain.Order;
import domain.Table;
import domain.TableRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber(int function, HashMap<Integer, ArrayList<Order>> orderSheet) {
        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables,orderSheet);
        if (function == 1) {
            System.out.println("\n##주문할 테이블을 선택하세요.");
        } else if (function == 2) {
            System.out.println("\n##결제할 테이블을 선택하세요.");
        }
        String userInput = scanner.next();
        while (new Check().isInputTableNumberError(userInput)) {
            userInput = scanner.next();
        }
        return Integer.parseInt(userInput);
    }

    public static int inputFunction() {
        OutputView.printMainScreen();
        String userInput = scanner.next();
        while (new Check().isInputFunctionError(userInput)) {
            userInput = scanner.next();
        }
        return Integer.parseInt(userInput);
    }

    public static Order inputMenus() {
        final List<Menu> menus = MenuRepository.menus();
        int menuNumber = inputMenuNumber();
        int menuCount = inputMenuCount();
        Menu result = menus.get(0);
        for (Menu menu : menus){
            if (menu.getNumber()==menuNumber){
                result = menu;
            }
        }
        return new Order(result,menuCount);
    }

    public static int inputCreditOrCash(int tableNumber) {
        System.out.println(tableNumber + "번 테이블의 결제를 진행힙니다.\n신용카드는 1번, 현금은 2번");
        return scanner.nextInt();
    }

    private static int inputMenuNumber() {
        OutputView.printMenus();
        System.out.println("\n#등록할 메뉴를 선택하세요.");
        String userInput = scanner.next();
        while (new Check().isInputMenuNumberError(userInput)) {
            userInput = scanner.next();
        }
        return Integer.parseInt(userInput);
    }

    private static int inputMenuCount() {
        System.out.println("\n메뉴의 수량을 입력하세요.");
        String userInput = scanner.next();
        while (new Check().isInputMenuCountError(userInput)) {
            userInput = scanner.next();
        }
        return Integer.parseInt(userInput);
    }
}
