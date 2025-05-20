class A
{
    public void show()
    {
        System.out.println("Inside A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("Inside B");
    }
}
public class Demo23 
{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
} 
