public class Evenodd
{
    public static void main(String[] args)
    {
        int n = 10;
        int result = 0;
        //if (n % 2 == 0)
        //    result = 10;
        //else
        //    result = 20;

        //?: ==>//Ternary operator What ever codition you have it might written true or false (?False)(:True)
        result = (n % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}