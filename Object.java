class Calculator
{
    int a;
    public int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class Object
{
    public static void main(String[] args)
    {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);
        //int result = num1 + num2; // This is also correct

        System.out.println(result);
    }
}
        // Object Oriented Programming System
        // Objext-Properties and multiple behaviours