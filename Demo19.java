abstract class Computer
{
    public abstract void code();
}
class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code : cmpile : run");
    }
}
class Desktop extends Computer
{
    public void code()
    {
        System.out.println("code : cmpile : run : Faster");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class Demo19 
{
    public static void main(String[] args) 
    {
       // Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(desk);
    }   
}
