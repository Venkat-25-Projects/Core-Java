
class Mobile
{
    String brand;// instance variable
    int price;
    String network;
    String name;
    //public void show()

    static
    {
    
        System.out.println("This is static block");
    }

    public Mobile()
    {
        brand = "Samsung";
        price = 50000;
        network = "4G";
        name = "S10";
    }

    {
        System.out.println(brand + " : " + name + " : " + price + " : " + network);//Method that will print the details of the mobile object
    }
}
public class Myprogram4 
{
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 50000;
        m1.network = "4G";
        m1.name = "Galaxy S10";

        Mobile m2 = new Mobile();
        m2.brand = "Applendf";
        m2.price = 500000;
        m2.network = "5G";
        m1.name = "apple S10";
        System.out.println();
        //m1.show();
        //m2.show();
        
    }
    
}
