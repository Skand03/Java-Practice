package ecommerceCode;

public class User {
    String name;
    String email;

    static int customerCount = 0;

    User(String name, String email) {
        this.name = name;
        this.email = email;
        customerCount++;
    }

    public void showDetails() {
        System.out.println("Customer name : " + name);
        System.out.println("Customer email : " + email);
        System.out.println("Total customers : " + customerCount);
    }
}
