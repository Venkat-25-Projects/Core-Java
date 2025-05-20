enum Laptop {
    Macbook(2000), Dell(1500), HP(1800);

    private int price;

    // Constructor to initialize the price for each laptop
    Laptop(int price) {
        this.price = price;
    }

    // Getter method to access the price
    public int getPrice() {
        return this.price;
    }
}

public class Demo22 {
    public static void main(String[] args) {
        // Using the enum constant and getting its price
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
    }
}
