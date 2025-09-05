public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("═══ Food Ordering System ═══");
            System.out.println("Creating orders and adding items...");

            Order order1 = new Order("Alice Johnson");
            Order order2 = new Order("Bob Smith");
            Order order3 = new Order("Charlie Brown");


            order1.addItem("Pizza", 8.99);
            order1.addItem("Burger", 7.50);
            order1.addItem("Fries", 3.25);
            System.out.println("Item 'Pizza' added successfully");
            System.out.println("Items added: Burger, Fries");


            try {
                order2.addItem("Pizza", -10.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            order2.addItem("Pizza", 12.95);
            order2.addItem("Burger", 10.25);
            order2.addItem("Fries", 9.25);
            System.out.println("Item 'Pizza' added successfully");
            System.out.println("Items added: Burger, Fries");


            try {
                order3.addItem("", 5.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            order3.addItem("Pizza", 9.50);
            order3.addItem("Burger", 8.75);
            order3.addItem("Fries", 6.25);
            System.out.println("Item 'Pizza' added successfully");
            System.out.println("Items added: Burger, Fries");

            System.out.println();
            System.out.println("Order Results:");
            System.out.println(order1.displayOrder());
            System.out.println(order2.displayOrder());
            System.out.println(order3.displayOrder());
            System.out.println();
            System.out.println("Total orders created: " + Order.getTotalOrders());

            Order largestOrder = order1;
            if (order2.getTotalAmount() > largestOrder.getTotalAmount()) largestOrder = order2;
            if (order3.getTotalAmount() > largestOrder.getTotalAmount()) largestOrder = order3;

            System.out.println("Largest order: " + largestOrder.getCustomerName() +
                    " ($" + String.format("%.2f", largestOrder.getTotalAmount()) + ")");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
