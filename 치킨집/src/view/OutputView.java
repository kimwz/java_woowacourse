package view;

import domain.Calculate;
import domain.Menu;
import domain.Table;
import domain.MenuRepository;
import domain.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OutputView {
    final static double DISCOUNT_RATE_OF_CASH = 0.95;
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String BOTTOM_LINE_ORDERED = "└ ₩ ┘";

    public static void printTables(final List<Table> tables, HashMap<Integer, ArrayList<Order>> orderSheet) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printBottomLine(tables, orderSheet);
    }

    public static void printMenus() {
        final List<Menu> menus = MenuRepository.menus();
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    public static void printMainScreen() {
        System.out.println("\n##메인화면\n1 - 주문등록\n2 - 결제\n3 - 프로그램 종료");
        System.out.println("원하는 기능을 입력하세요.");
    }

    public static void printOrderRecord(ArrayList<Order> orderList) {
        System.out.println("##주문 내역\n메뉴  수량  금액");
        for (Order order : orderList) {
            System.out.println(order.getName() + " " + order.getCount() + " " + order.getPrice());
        }
        System.out.println();
    }

    public static int printPayMessage(int tableNumber, ArrayList<Order> orderList) {
        int userInput = InputView.inputCreditOrCash(tableNumber);
        int finalPrice = Calculate.CalculatePrice(orderList);
        if (userInput == 1) {
            System.out.println("\n##최종 결제할 금액\n" + finalPrice + "원");
            return 0;
        }
        System.out.println("\n##최종 결제할 금액\n" + finalPrice * DISCOUNT_RATE_OF_CASH + "원");
        return 0;
    }

    public static void printIsNumberErrorMessage() {
        System.out.println("숫자만 입력해주세요.");
    }

    public static void printIsBetweenRangeErrorMessage(List<Integer> functionNumber) {
        for (int number : functionNumber) {
            System.out.print(number + " ");
        }
        System.out.println("중 하나를 입력하세요");
    }

    public static void printIsUnderHundredErrorMessage() {
        System.out.println("1 이상 99 이하의 숫자를 입력하세요.");
    }

    public static void printPayErrorMessage(int tableNumber) {
        System.out.println(tableNumber + "번 테이블은 결제할 금액이 없습니다.");
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    private static void printBottomLine(final List<Table> tables,
                                        HashMap<Integer, ArrayList<Order>> orderSheet) {
        for (Table table : tables) {
            if (orderSheet.containsKey(table.getNumber())) {
                System.out.print(BOTTOM_LINE_ORDERED);
                continue;
            }
            System.out.print(BOTTOM_LINE);
        }
        System.out.println();
    }
}
