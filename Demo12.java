class Laptop
{
    String model;
    int price;
    String color;

    public String toString()
    {
        return model + " : " + price;
    }

    public boolean equals(Laptop that)
    {
        return (this.model.equals(that.model) && this.price == that.price);
        
        

    }
}


public class Demo12 
{
    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
        obj.model = "Hp";
        obj.price = 50000;

        Laptop obj1 = new Laptop();
        obj1.model = "HP";
        obj1.price = 50000;

        boolean result = obj .equals(obj1);

        System.out.println(result);
    }    
}
