package ecommerceCode;

public class Order {
    int orderId;

    Order(int orderId) {
        this.orderId = orderId;
    }

    public class OrderDetails {
        Product product;
        int quantity;

        public void showOrder() {
            System.out.println("Order id: " + orderId);
            System.out.println("Product: " + product.name);
            System.out.println("Quantity: " + quantity);
        }
    }

}
