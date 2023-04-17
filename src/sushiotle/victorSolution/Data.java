package sushiotle.victorSolution;

import sushiotle.victorSolution.models.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<OrderItem> constructOrderType(){
        OrderItem roll = new OrderItem("Roll", 6.99);
        OrderItem bowl = new OrderItem("Bowl", 7.99);

        List<OrderItem> orderItems = new ArrayList();

        orderItems.add(roll);
        orderItems.add(bowl);

        return orderItems;
    }
    public static List<OrderItem> constructProtein(){
        OrderItem blueFinTuna = new OrderItem("Blue Fin Tuna", 5.99);
        OrderItem salmon = new OrderItem("Salmon", 6.99);

        List<OrderItem> proteins = new ArrayList();

        proteins.add(blueFinTuna);
        proteins.add(salmon);

        return proteins;
    }

    public static List<OrderItem> constructToppings(){
        OrderItem rice = new OrderItem("Rice", 1.00);
        OrderItem cucumber = new OrderItem("Cucumber", 1.29);
        OrderItem creamCheese = new OrderItem("Cream Cheese", 2.25);
        OrderItem carrots = new OrderItem("Carrots", 0.70);
        OrderItem sesameSeeds = new OrderItem("Sesame Seeds", 0.25);
        OrderItem soyBeanPaper = new OrderItem("Soy Bean Paper", 1.01);
        OrderItem avocado = new OrderItem("Avocado", 2.01);
        OrderItem fishRoe = new OrderItem("Fish Roe", 2.02);
        OrderItem onions = new OrderItem("Onions", 0.74);
        OrderItem wasabi = new OrderItem("Wasabi", 0.01);

        List<OrderItem> toppings = new ArrayList();

        toppings.add(rice);
        toppings.add(cucumber);
        toppings.add(creamCheese);
        toppings.add(carrots);
        toppings.add(sesameSeeds);
        toppings.add(soyBeanPaper);
        toppings.add(avocado);
        toppings.add(fishRoe);
        toppings.add(onions);
        toppings.add(wasabi);

        return toppings;
    }

    public static List<OrderItem> constructSauces() {
        OrderItem unagi = new OrderItem("Unagi", 0.99);
        OrderItem sirachaMayo = new OrderItem("Siracha Mayo", 1.89);
        OrderItem soySauce = new OrderItem("Soy Sauce", 0.25);

        List<OrderItem> sauces = new ArrayList();

        sauces.add(unagi);
        sauces.add(sirachaMayo);
        sauces.add(soySauce);

        return sauces;
    }
}
