package sushiotle;

public class OrderFillings {

    private String fillingName;
    private double fillingPrice;

    public OrderFillings() {
    }
    public String getFillingName() { return fillingName; }
    public void setFillingName(String fillingName) { this.fillingName = fillingName; }

    public double getFillingPrice() { return fillingPrice; }
    public void setFillingPrice(double fillingPrice) { this.fillingPrice = fillingPrice; }


    public OrderFillings(String fillingName, double fillingPrice) {
        this.fillingName = fillingName;
        this.fillingPrice = fillingPrice;

    }

    @Override
    public String toString() {
        return fillingName + ", price:" + fillingPrice;
    }
}
