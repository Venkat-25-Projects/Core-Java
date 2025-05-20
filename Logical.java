public class Logical
{
    public static void main(String[] args)
    {
        //Logical Operators
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        
        //And
        boolean result = x > y  && a > b;// TRUE
        //boolean result = x > y  && a < b; TRUE
        
        //OR We can use multiple pipes as required for the program
        //boolean result = x > y  || a > b; TRUE
        //boolean result = x > y  || a < b; TRUE
        
        /*boolean result = a > b ;
        System.out.println(!result);*/

        System.out.println(result);
    }
}