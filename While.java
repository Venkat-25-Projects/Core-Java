public class While
{
    public static void main(String[] args)
    {
        //Repeat this statement 5 times //If we want to repeat a statement 5 times, we can use a for loop with a counter variable
        // there are different types of loops in java, for, while, do-while, for-each, enhanced for loop
        // these are all help to repeat a statement or a block of statements in a program
        //Loops ==>while, Do-while, For


    //While-Loop
        int i = 1; //initialization of the counter variable
        //while(true)
        while(i <= 4)       
        {
            System.out.println("hi" + i);
            i++;
        }
        System.out.println("Bye");
    }
}