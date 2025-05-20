class Human
{
    private int age = 10;
    private String name = "Manasa";

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}


public class Demo1 
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        //obj.age = 25;
        //obj.name = "John";

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
    
}
