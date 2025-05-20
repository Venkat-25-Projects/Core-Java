//Final Method and class

final class Calc
{
    public final void show()
    {
        System.out.println("This is a final method");
    }
    public void add(int a, int b)
    {
        System.out.println("Sum is: "+(a+b));
    }
}
class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("This is a method in AdvCalc");
    }
    
}

public class Demo11 
{
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(10, 20);
      
    }   
}
