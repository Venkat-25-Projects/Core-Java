class A
{
    public void show()
    {
        System.out.println("Inside A");
    }
    public void config()
    {
        System.out.println("Config A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("Inside B");
    }
}

public class Demo8 
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();
    }   
}
