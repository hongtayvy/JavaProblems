package sushiotle;

public class OrderProtein {

    private String name;
    private double priceofProtein;
    private String greeting;

    public OrderProtein() {
    }
    public String getGreeting() { return greeting; }
    public void setGreeting(String greeting) { this.greeting = greeting; }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPriceofProtein() {return priceofProtein; }
    public void setPriceofProtein(double priceofProtein) {
        this.priceofProtein = priceofProtein;
    }

    public OrderProtein(double price, String name, String greeting) {
        this.name = name;
        this.priceofProtein = price;
        this.greeting = greeting;
    }


    @Override
    public String toString() {
        return  name + " priced at $" + priceofProtein;
    }

}
