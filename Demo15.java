//Abstract keyword
abstract class Car
{
    public abstract void drive();
    
    public void playMusic()
    {
        System.out.println("Music is playing");
    }
}

class Wagon extends Car
{
    public void drive()
    {
        System.out.println("Wagon is driving");
    }
}

public class Demo15 
{
    public static void main(String[] args) 
    {
        Car obj = new Wagon();
        obj.drive();
        obj.playMusic();

    }    
}
