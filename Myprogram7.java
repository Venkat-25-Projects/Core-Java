//Constuctors are appilications of the class
//If we want to connect to a database, we can create a constructor that takes the database name as a parameter
//in this constructor we can also wite in methodover loading to connect to different types of databases



class Human
{
    private int age;
    private String name;

    // Constructor
    public Human()
    {
        System.out.println("in constructor");
    }

    // Getter and Setter for age
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter and Setter for name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Myprogram7 
{
    public static void main(String[] args)
    {
        // Create a new Human object
        Human obj = new Human();
        System.out.println(obj.getAge() + " : " + obj.getName());

        // Set values using setter methods
        obj.setAge(30); // Corrected
        obj.setName("John"); // Corrected

        // Print updated values
        //System.out.println("Age: " + obj.getAge() + " Name: " + obj.getName());   
    }    
}
