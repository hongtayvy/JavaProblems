package sushiotle;

public class OrderProtein {

    private String name;
    private double price;
    private String greeting;

    public String getGreeting() { return greeting; }
    public void setGreeting(String greeting) { this.greeting = greeting; }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {return price; }
    public void setPrice(double price) {
        this.price = price;
    }

    public OrderProtein(double price, String name, String greeting) {
        this.name = name;
        this.price = price;
        this.greeting = greeting;
    }


    @Override
    public String toString() {
        return  name + " priced at $" + price;
    }

}
