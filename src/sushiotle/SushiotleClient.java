package sushiotle;

import sushiotle.victorSolution.models.Order;
import sushiotle.victorSolution.models.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sushiotle.victorSolution.data.Data.*;

public class SushiotleClient {
    public static Scanner stdIn = new Scanner(System.in);

    public static void runSushiotleClient() {
        List<OrderItem> orderType = constructOrderType();
        List<OrderItem> proteins = constructProtein();
        List<OrderItem> toppings = constructToppings();
        List<OrderItem> sauces = constructSauces();
        List<Order> orders = new ArrayList();
        boolean doneOrdering = false;
        System.out.println("Hello! Welcome to Sushiotle");
        Order order = null;
        List<OrderItem> orderItems = null;
        String choice = "";

        while (!doneOrdering) {
            order = new Order();
            orderItems = new ArrayList();

            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0 -> orderItems.addAll(selectOrderItems(orderType, true));
                    case 1 -> orderItems.addAll(selectOrderItems(proteins, false));
                    case 2 -> orderItems.addAll(selectOrderItems(toppings, false));
                    case 3 -> orderItems.addAll(selectOrderItems(sauces, false));
                }
            }
            order.setOrderItemList(orderItems);

            System.out.println("Would you like to order more items? (Y) or (N)");
            choice = stdIn.nextLine();
            while (choice.isEmpty() && !choice.toUpperCase().equals("N") && !choice.toUpperCase().equals("Y")) {
                System.out.println("I didn't hear you. Would you like to order more items? (Y) or (N)");
                choice = stdIn.nextLine();
            }

            orders.add(order);

            if (choice.toUpperCase().equals("N")) {
                doneOrdering = true;
            }
        }
        stdIn.close();
        calculateTotal(orders);
    }

    private static void calculateTotal(List<Order> orders) {
        double totalOrderAmount = 0.00;

        for(Order order : orders){
            totalOrderAmount += order.calculateTotal();
            System.out.println("Order contains:" + "\n" +
                    order.toString() +
                    "Your total amount owed is: " + order.calculateTotal() + "\n"
                    );
        }
        if (totalOrderAmount != 0.00) {
            System.out.println("The total order amount is: " + totalOrderAmount);
        }
    }

    private static List<OrderItem> selectOrderItems(List<OrderItem> orderItemListToSelect, boolean limitChoice) {
        List<OrderItem> returnedOrderItems = new ArrayList();
        boolean selectFillings = false;
        String moreFillings = "";
        String choice = "";
        int integerValueChoice = 0;

        while (!selectFillings) {
            for (int i = 0; i < orderItemListToSelect.size(); i++) {
                System.out.println(i + 1 + ": " + orderItemListToSelect.get(i).toString());
            }
            System.out.println("Select a item from the list (select a number): ");
            choice = stdIn.nextLine();
            integerValueChoice = Integer.parseInt(choice);
            while (integerValueChoice > orderItemListToSelect.size() || integerValueChoice < 0) {
                System.out.println("Please select a item from the list (select a number): ");
                for (int i = 0; i < orderItemListToSelect.size(); i++) {
                    System.out.println(i + 1 + ": " + orderItemListToSelect.get(i).toString());
                }
                choice = stdIn.nextLine();
                integerValueChoice = Integer.parseInt(choice);
            }
            integerValueChoice = Integer.parseInt(choice);
            returnedOrderItems.add(orderItemListToSelect.get(integerValueChoice - 1));

            if (!limitChoice) {
                System.out.println("Would you like to add more items from the current list (Y) or (N):");
                moreFillings = stdIn.nextLine();
                while (moreFillings.isEmpty() && !moreFillings.toUpperCase().equals("N") && !moreFillings.toUpperCase().equals("Y")) {
                    System.out.println("I didn't quite get that. Would you like to add more items from the current list (Y) or (N): ");
                    moreFillings = stdIn.nextLine();
                }
                if (moreFillings.equalsIgnoreCase("N")) {
                    selectFillings = true;
                }
            } else {
                selectFillings = true;
            }
        }
        return returnedOrderItems;
    }
}
