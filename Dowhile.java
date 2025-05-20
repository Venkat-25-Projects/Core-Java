public class Dowhile
{
    public static void main(String[] args)
    {
        //Do-While will execute once even if our condition is false.
        //If the conditon is true it will execute the output.
        int i = 6;
        do
       {
            System.out.println("Hi " + i);

            i++;
        } while(i<=4);
    }
}