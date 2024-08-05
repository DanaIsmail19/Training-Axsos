import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(this.menu.size());
        this.menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
        Order newOrder = new Order(name);

        displayMenu();
        
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if(index >= 0 && index < menu.size()) {
                    Item orderedItem = menu.get(index);
                    newOrder.addItem(orderedItem);
                } else {
                    System.out.println("Invalid item number. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
            
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        newOrder.display();
        this.orders.add(newOrder);
    }

    public void addMenuItemByInput() {
        System.out.println("Please enter the new item name:");
        String name = System.console().readLine();
        System.out.println("Please enter the new item price:");
        double price = Double.parseDouble(System.console().readLine());
        addMenuItem(name, price);
    }
}
