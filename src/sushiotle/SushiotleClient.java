package sushiotle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SushiotleClient {
    public static void runSushiotle() {

        Scanner stdin= new Scanner(System.in);
        String input = "";
        boolean activeOrdering = true;

        List totalOrder = new ArrayList();
        CustomizedOrder firstOrder = new CustomizedOrder();
        //CustomizedOrder secondOrder = new CustomizedOrder();
        List menuNavigator = new ArrayList();



        totalOrder.add(firstOrder);
        //totalOrder.add(secondOrder);
        menuNavigator.add("1. Protein selection");
        menuNavigator.add("2. Filling Selection");
        menuNavigator.add("3. Sauce Selection");
        menuNavigator.add("4. Add another item");
        menuNavigator.add("5. Checkout");
        firstOrder.setOrderType(pickASushiType());


        while(activeOrdering) {
        System.out.println("What would you like to add to you sushi?(Please select the menu number)");
        printListStatus(menuNavigator);
        input = stdin.nextLine();


            if(input.equalsIgnoreCase("1")){
                firstOrder.setOrderProtein(pickAProtein());
            } else if(input.equalsIgnoreCase("2")) {
                firstOrder.setFillings(pickFillings());
            } else if(input.equalsIgnoreCase("3")) {
                firstOrder.setSauces(pickSauces());
            } else if(input.equalsIgnoreCase("4")) {

            } else if(input.equalsIgnoreCase("5")) {
                checkout(totalOrder);
                activeOrdering = false;
            }
        }
    }
    public static OrderType pickASushiType() {


        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<OrderType> availableTypesOfSushi = new ArrayList<>();
        OrderType customerSelectedTypeOfSushi = new OrderType();

        OrderType roll = new OrderType(  4.99, "You've chosen a roll.", "1. Sushi roll; starting at $4.99");
        OrderType bowl = new OrderType(  6.99, "You've chosen a Poke Bowl.", "2. Poke Bowl, starting at $6.99");

        availableTypesOfSushi.add(roll);
        availableTypesOfSushi.add(bowl);

        roll.setPriceOfType(2.99);
        System.out.println("Welcome to Sushiotle, Please select your type of sushi.(enter the menu number)");
        for(int i = 0; i < availableTypesOfSushi.size(); i++) {
            System.out.println(availableTypesOfSushi.get(i).getGreeting());
        }
        input = stdin.nextLine();
        if(input.equalsIgnoreCase("1")) {
            System.out.println("You have selected a sushi roll.");
        } else if (input.equalsIgnoreCase("2")) {
            System.out.println("You have selected a poke bowl.");
        }
        customerSelectedTypeOfSushi = (availableTypesOfSushi.get(Integer.parseInt(input) - 1));

        return customerSelectedTypeOfSushi;
    }

    public static OrderProtein pickAProtein() {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<OrderProtein> availableTypesOfProtein = new ArrayList<>();
        OrderProtein customerSelectedTypeOfProtein = new OrderProtein();

        OrderProtein salmon = new OrderProtein(2.99, "1. Salmon","Protein selected is Salmon.");
        OrderProtein tuna = new OrderProtein(1.99, "2. Tuna", "Protein selected is Tuna.");
        OrderProtein yellowTail = new OrderProtein(2.99, "3. Yellow Tail", "Protein selected is Yellow Tail.");

        availableTypesOfProtein.add(salmon);
        availableTypesOfProtein.add(tuna);
        availableTypesOfProtein.add(yellowTail);

        System.out.println("Please select a type of fish to add to your order(enter the menu number).");
        for( int i = 0; i < availableTypesOfProtein.size(); i++) {
            System.out.println(availableTypesOfProtein.get(i));
        }

        input = stdin.nextLine();
        customerSelectedTypeOfProtein = (availableTypesOfProtein.get(Integer.parseInt(input) - 1));

        return customerSelectedTypeOfProtein;
    }

    public static List pickFillings() {

        Scanner stdin = new Scanner(System.in);
        String input = "";

        List<OrderFillings> availableFillings = new ArrayList(12);
        List<OrderFillings> customersSelectedFillings = new ArrayList<>(10);

        OrderFillings avocado = new OrderFillings("1. Avocado", 1.99);
        OrderFillings cucumber = new OrderFillings("2. Cucumber", 0.99);
        OrderFillings redCabbage = new OrderFillings("3. Red Cabbage", 0.99);
        OrderFillings corn = new OrderFillings("4. Corn", 0.99);
        OrderFillings lettuce = new OrderFillings("5. Lettuce", 0.00);
        OrderFillings carrots = new OrderFillings("6. Carrots", 0.99);
        OrderFillings daikon = new OrderFillings("7. Daikon", 1.49);
        OrderFillings tamago = new OrderFillings("8. Tamago", 1.99);
        OrderFillings salmonRoe = new OrderFillings("9. Salmon Roe", 1.99);
        OrderFillings sesameSeeds = new OrderFillings("10. Sesame Seeds", 0.00);
        OrderFillings bonitoFlakes = new OrderFillings("11. Bonito Flakes", 0.99);
        OrderFillings jalapenos = new OrderFillings("12. Jalapenos", 0.99);

        availableFillings.add(avocado);
        availableFillings.add(cucumber);
        availableFillings.add(redCabbage);
        availableFillings.add(corn);
        availableFillings.add(lettuce);
        availableFillings.add(carrots);
        availableFillings.add(daikon);
        availableFillings.add(tamago);
        availableFillings.add(salmonRoe);
        availableFillings.add(sesameSeeds);
        availableFillings.add(bonitoFlakes);
        availableFillings.add(jalapenos);

        boolean addFillingFlag = true;

        while(addFillingFlag) {

            System.out.println("Please choose one filling from the list below(Select the item number,You may add more later)");
            for(int i = 0; i < availableFillings.size(); i++ ) {
                System.out.println(availableFillings.get(i));
            }
            input = stdin.nextLine();
            customersSelectedFillings.add(availableFillings.get(Integer.parseInt(input) - 1));
            if(input.equals("1") || input.equals("8") || input.equals("9")) {
                System.out.println("You've selected a premium topping(+1.99)");
            }

            for(int i = 0; i < customersSelectedFillings.size(); i++){
                System.out.println("Your sushi currently holds " + customersSelectedFillings.get(i));
            }

            if(customersSelectedFillings.size() == 10 ) {
                System.out.println("You cannot add anymore fillings.");
                addFillingFlag = false;
            } else {
                System.out.println("Would you like to add more fillings? Y/N?");
                input = stdin.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    addFillingFlag = true;
                } else if(input.equalsIgnoreCase("N")) {
                    addFillingFlag = false;
                }
            }
        }
        return customersSelectedFillings;
    }

    public static List pickSauces() {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<String> availableSauces = new ArrayList();
        List<String> customerSelectedSauces = new ArrayList<>(3);

        availableSauces.add("1. Spicy Mayo");
        availableSauces.add("2. Ponzu");
        availableSauces.add("3. Unagi Sauce");
        availableSauces.add("4. Wasabi Mayo");
        availableSauces.add("5. Sweet Pepper Sacue");

        boolean addFillingFlag = true;
        while (addFillingFlag) {
            System.out.println("Please pick which sauce you would like in your sushi.(enter menu item number)");

            for (int i = 0; i < availableSauces.size(); i++) {
                System.out.println(availableSauces.get(i));
            }


            input = stdin.nextLine();
            customerSelectedSauces.add(availableSauces.get(Integer.parseInt(input) - 1));
            if (customerSelectedSauces.size() == 3) {
                System.out.println("You cannot add anymore sauces.");
                addFillingFlag = false;
            } else {
                System.out.println("Would you like to add more sauces? Y/N?");
                input = stdin.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    addFillingFlag = true;
                } else if (input.equalsIgnoreCase("N")) {
                    addFillingFlag = false;
                }
            }
        }
            return customerSelectedSauces;

    }

    public static void printListStatus(List creationOrder) {
        for(int i = 0; i < creationOrder.size(); i++) {
            System.out.println(creationOrder.get(i));
        }
    }

    public static void checkout(List customerCompleteOrder) {
        for ( int i = 0; i < customerCompleteOrder.size(); i++) {

            System.out.println(customerCompleteOrder.get(i));
            
        }
    }
}
