//Type casting in oop's
class A
{
    public void show1()
    {
        System.out.println("This is method of class A");
    }
class B extends A
{
    public void show2()
    {
        System.out.println("This is method of class B");
    }
}
}
public class Demo14 
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.show1();
        
        //B obj1 = (B) obj;
        //obj1.show2();


    }   
}
