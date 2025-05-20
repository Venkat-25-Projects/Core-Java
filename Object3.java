class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing..");
    }

    public String getMeAPen(int cost)
    {
        if (cost >= 100)
            return "Pen";
        
        return "Nothing";
    }

}


public class Object3
{
    public static void main(String[] args)
    {
       Computer obj = new Computer();
       obj.playMusic();
       String str = obj.getMeAPen(120);
       System.out.println(str);
    }
    
}
