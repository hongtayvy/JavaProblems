package sushiotle.victorSolution.models;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<OrderItem> orderItemList = new ArrayList();

    public Order(){}

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(OrderItem orderItem : orderItemList){
            sb.append("  " + orderItem.toString() + "\n");
        }

        return sb.toString();
    }

    public double calculateTotal(){
        double total = 0.00;
        for(OrderItem orderItem : orderItemList){
            total += orderItem.getPrice();
        }

        return total;
    }
}
