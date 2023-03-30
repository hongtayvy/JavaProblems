package sushiotle;

public class OrderType {

    private double priceOfType;
    private String selection;
    private String greeting;
    private String menuDesignation;

    public String getGreeting() { return greeting; }
    public void setGreeting(String greeting) { this.greeting = greeting; }


    public String getSelection() { return selection; }
    public void setSelection(String selection) {
        this.selection = selection;
    }

    public double getPriceOfType() { return priceOfType; }
    public void setPriceOfType(double priceOfType) {
        this.priceOfType = priceOfType;
    }

    //may need to delete if I don't use
    public String getMenuDesignation() { return menuDesignation; }
    public void setMenuDesignation(String menuDesignation) { this.menuDesignation = menuDesignation; }


    public OrderType(double price, String selection, String greeting) {
        this.selection = selection;
        this.priceOfType = price;
        this.greeting = greeting;
        this.menuDesignation = menuDesignation;
    }


    @Override
    public String toString() { return selection + " cost starting at " + priceOfType;
    }
}
