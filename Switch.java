public class Switch
{
    public static void main(String[] args)
       /* {
        int n = 1;
        if(n==1)
            System.out.println("Monday");
        else if(n==2)
            System.out.println("tuesday");
        else if(n==3)
            System.out.println("Wednesday");//What Ever value that we Give to variable that day will be printed.
        else if(n==4)
            System.out.println("Thursday");
        else if(n==5)
            System.out.println("Friday");
        else if(n==6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
        } */
        

        //Switch case statement
        //Break statement is used to terminate the loop or switch case statement.
        //Switch case statement is used to execute different blocks of code based on different cases.
        //case is used to specify the value that we want to check.
        //Default case is used to execute when no case matches.
        {
        int n = 8;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid Number");

        }

        }
}