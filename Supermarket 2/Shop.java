public class Shop {
    private double price;
    public String name;
    private int quantity;

    public Shop(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getprice() {
        return price;
    }

    public int getquantity() {
        return quantity;
    }

    public String getname() { return name; }
}
