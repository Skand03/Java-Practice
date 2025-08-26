package ecommerceCode;

public class Admin extends User {
    final String storeName = "MegaMart";

    Admin(String name, String email) {
        super(name, email);
    }

    final void deleteProducts(Product p) {
        System.out.println("Admin " + storeName + " deleted product: " + p.name);
    }

}
