class Innerencapulation 
{
    private int age = 11;
    private String name = "John";//these are the encapsulated data members

    public int getAge()//these are the getter methods
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)//these are the setter methods
    {
        name = n;
    }

    
}

public class Myprogram6 
{
    public static void main(String[] args)
        {
            Innerencapulation obj = new Innerencapulation();//this is the object of the class Innerencapulation
            obj.setAge(11);
            obj.setName("John");// these are the methods to set the values of the variables
            System.out.println(obj.getName() + " :" + obj.getAge());
        }
    
}
