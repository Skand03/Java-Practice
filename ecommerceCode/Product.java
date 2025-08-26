package ecommerceCode;

public class Product {
    private int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        System.out.println("Product id : " + getId());
        System.out.println("Product name : " + getName());
        System.out.println("Product price : " + getPrice());

        int intPrice = (int) getPrice();
        System.out.println(intPrice);
    }

}
