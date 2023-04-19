package sushiotle;

import java.util.List;

public class CustomizedOrder {

    private OrderType orderType;
    private OrderProtein orderProtein;
    private List fillings;


    private List sauces;

    public CustomizedOrder() {
    }

    public CustomizedOrder(OrderType orderType, OrderProtein orderProtein) {
        this.orderType = orderType;
        this.orderProtein = orderProtein;
    }


    public OrderType getOrderType(OrderType orderType) {
        return this.orderType;
    } public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderProtein getOrderProtein(OrderProtein orderProteins) {
        return orderProtein;
    } public void setOrderProtein(OrderProtein orderProtein) {
        this.orderProtein = orderProtein;
    }

    public List getFillings(List list) {
        return fillings;
    } public void setFillings(List fillings) { this.fillings = fillings; }

    public List getSauces() {
        return sauces;
    }public void setSauces(List sauces) { this.sauces = sauces; }


    @Override
    public String toString() {
        return
                "Order style: " + "[" + orderType + "]\n" +
                "Order protein: " +  "[" + orderProtein + "]\n" +
                "Fillings: " + fillings + "\n" +
                "Sauces: " + sauces + "\n" +
                "Your total for your order is: " + calculateTotal();

    }

    public double calculateTotal() {
        return orderType.getPriceOfType() + orderProtein.getPriceofProtein();
    }
}
