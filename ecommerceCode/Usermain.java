package ecommerceCode;

public class Usermain {
    public static void main(String[] args) {
        Product p = new Product(101, "Smarthphone", 75000);
        p.show();
        Admin a = new Admin("Radhe", "Radhe03@gmail.com");
        a.showDetails();

        User u = new User("Skand", "Skand@gmail.com");
        u.showDetails();

        System.out.println("The total number of UserCount is " + User.customerCount);

        System.out.println(p.getPrice());

        Order o = new Order(1);
        Order.OrderDetails od = o.new OrderDetails();
        od.product = p;
        od.quantity = 2;
        od.showOrder();
    }
}
