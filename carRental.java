public class carRental {
    String carRentall;
    int rental;
    int farekm;

    carRental(String carRentall) {
        this.carRentall = carRentall;

        switch (carRentall.toLowerCase()) {
            case "car":
                rental = 800;
                farekm = 10;
                break;

            case "van":
                rental = 100;
                farekm = 10;
                break;

            case "bus":
                rental = 1200;
                farekm = 50;
                break;

            default:
                System.out.println("Invalid");
        }
    }

    void carBill(int distance) {
        int total = rental + (farekm * distance);
        System.out.println("" + carRentall);
        System.out.println("" + total);
    }

    public static void main(String[] args) {
        carRental r1 = new carRental("car");

        r1.carBill(100);

        carRental r2 = new carRental("van");
        r2.carBill(200);
    }

}
