package programs;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double getPrice(int quantity){
        return price*quantity;
    }

    public void setPrice(double price) {
        this.price = price;
}
}
