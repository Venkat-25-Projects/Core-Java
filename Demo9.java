//Polymorphism

class A
{
    public void show()
    {
        System.out.println("Inside class A");
    }

}
class B extends A
{
    public void show()
    {
        System.out.println("Inside class B");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("Inside class C");
    }
}




public class Demo9 
{
 public static void main(String[] args)
 {
    A obj = new A();
    obj.show();


    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
 }
}
