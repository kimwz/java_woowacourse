package domain;

public class Order {
    private Menu menu;
    private int count;

    public Order(Menu menu, int count) {
        this.menu = menu;
        this.count = count;
    }

    public String getName() {
        return menu.getName();
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return count * menu.getPrice();
    }

    public Category getCategory(){
        return menu.getCategory();
    }
}
