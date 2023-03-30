package sushiotle;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SushiotleClient {
    public static void runSushiotle() {

        Scanner stdin= new Scanner(System.in);
        String input = "";
        List completeOrder = new ArrayList();
        List menuNavigator = new ArrayList();

        menuNavigator.add("1. Protein selection");
        menuNavigator.add("2. Filling Selection");
        menuNavigator.add("3. Sauce Selection");
        menuNavigator.add("4. Checkout");

        completeOrder.add(pickASushiType());
        System.out.println("What would you like to add to you sushi?(Please select the menu number)");
        printListStatus(menuNavigator);
        input = stdin.nextLine();

        if(input.equalsIgnoreCase("1")){
            completeOrder.add(pickAProtein());
        } else if(input.equalsIgnoreCase("2")) {
            completeOrder.add(pickFillings());
        } else if(input.equalsIgnoreCase("3")) {
            completeOrder.add(pickSauces());
        } else if(input.equalsIgnoreCase("4")) {
            
        }


        printListStatus(completeOrder);

    }
    public static List<OrderType> pickASushiType() {


        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<OrderType> availableTypesOfSushi = new ArrayList<>();
        List<OrderType> customerSelectedTypeOfSushi = new ArrayList<>();

        OrderType roll = new OrderType(  4.99, "You've chosen a roll.", "1. Sushi roll; starting at $4.99");
        OrderType bowl = new OrderType(  6.99, "You've chosen a Poke Bowl.", "2. Poke Bowl, starting at $6.99");

        availableTypesOfSushi.add(roll);
        availableTypesOfSushi.add(bowl);

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

        customerSelectedTypeOfSushi.add(availableTypesOfSushi.get(Integer.parseInt(input ) - 1));
        return customerSelectedTypeOfSushi;
    }
    public static List<OrderProtein> pickAProtein() {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<OrderProtein> availableTypesOfProtein = new ArrayList<>();
        List<OrderProtein> customerSelectedTypeOfProtein = new ArrayList<>();

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
        customerSelectedTypeOfProtein.add(availableTypesOfProtein.get(Integer.parseInt(input) - 1));
        return customerSelectedTypeOfProtein;
    }
    public static List pickFillings() {

        Scanner stdin = new Scanner(System.in);
        String input = "";

        List<String> availableFillings = new ArrayList(3);
        List<String> customersSelectedFillings = new ArrayList<>(10);

        availableFillings.add("1. Avocado");
        availableFillings.add("2. Cucumber");
        availableFillings.add("3. Red cabbage");

        boolean addFillingFlag = true;

        while(addFillingFlag) {

            System.out.println("Please choose one filling from the list below(Select the item number,You may add more later)");
            for(int i = 0; i < availableFillings.size(); i++ ) {
                System.out.println(availableFillings.get(i));
            }
            input = stdin.nextLine();
            customersSelectedFillings.add(availableFillings.get(Integer.parseInt(input) - 1));

            for(int i = 0; i < customersSelectedFillings.size(); i++){
                System.out.println(customersSelectedFillings.get(i));
            }
            addFillingFlag = false;
            if(customersSelectedFillings.equals(9)) {
                System.out.println("You cannot add anymore fillings.");
            } else {
                System.out.println("Would you like to add more fillings? Y/N?");
                input = stdin.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    addFillingFlag = true;
                } else if(input.equalsIgnoreCase("N")) {
                }
            }
        }
        return customersSelectedFillings;
    }

    public static List pickSauces() {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        List<String> availableSauces = new ArrayList();
        List<String> customerSelectedSauces = new ArrayList<>();

        availableSauces.add("1. Spicy Mayo");
        availableSauces.add("2. Ponzu");
        availableSauces.add("3. Unagi Sauce");

        System.out.println("Please pick which sauce you would like in your sushi.(enter menu item number)");

        for( int i = 0; i < availableSauces.size(); i++){
            System.out.println(availableSauces.get(i));
        }

        input = stdin.nextLine();
        customerSelectedSauces.add(availableSauces.get(Integer.parseInt(input) - 1));

        return customerSelectedSauces;
    }

    public static void printListStatus(List creationOrder) {
        for(int i = 0; i < creationOrder.size(); i++) {
            System.out.println(creationOrder.get(i));
        }
    }
}
