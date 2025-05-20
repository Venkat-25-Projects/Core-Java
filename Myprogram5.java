// Static method
class Mobile {
    String brand;
    int price;
    static String name; // Static field

    public void show() {
        System.out.println(brand + " : " + price + " : " + name); // Access static field directly
    }
}

public class Myprogram5 {
    public static void main(String[] args) {
        // Creating the first mobile object
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 50000;
        Mobile.name = "Galaxy S10"; // Correct way to access static field

        // Creating the second mobile object
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 500000;
        Mobile.name = "Apple S10"; // Correct way to access static field

        Mobile m3 = new Mobile();
        m3.brand = "Karbon";
        m3.price = 500000;
        Mobile.name = "Karbon S10"; // Correct way to access static field

        Mobile m4 = new Mobile();
        m4.brand = "OPPO";
        m4.price = 500000;
        Mobile.name = "Oppo S10"; // Correct way to access static field


        // Printing both object details
        m1.show(); // This will print: Samsung : 50000 : Apple S10
        m2.show(); // This will print: Apple : 500000 : Apple S10
        m3.show();
        m4.show();
    }
}
