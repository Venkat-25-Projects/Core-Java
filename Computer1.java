class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        return "pen";
    }
}

public class Computer1 // Renamed this class to Demo to avoid duplicate class name
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2); // Passing argument directly
        System.out.println(str);
    }
}
