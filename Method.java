//Method Over loading

class Calculator
{
    public int add1(int n1, int n2, int n3)//Method 1
    {
        return n1 + n2 + n3; // Int Values are calling as parameters
    }
    public int add(int n1, int n2)// Method 2
    {
        return n1 + n2;
    }
    public double add(double n1, int n2)// Method 3
    {
        return n1 + n2;
    }
     
}

public class Method 
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);//By Using Add We are Calling Method name As Add then we gave to the methods that should be printed
        System.out.println(r1);
    
    }
    
}
