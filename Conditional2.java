public class Conditional2
{
    public static void main(String[] args)
    {
        //if-else-if ==>Condition
        //Comparing 3 values in conditional statements
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) //false
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else 
            System.out.println(c);

    }
}