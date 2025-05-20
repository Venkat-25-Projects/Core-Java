public class Forloop {
    public static void main(String[] args) {
        // Outer loop to print "Day X"
        //In For loop we can mention 3 different statements in one line.
        //for(int i=1; i<=4; i++)//increment
        //for(int i=0; i<=4; i++) //Increment
        //for(int i=1; i<=5; i++)//print days in increment
        //for(int i=4; i>=1; i--) //Decrement
        for (int i = 1; i <= 5;) {
            System.out.println("Day " + i); // Print Day i
            
            // Inner loop to print values from 9-10 to 17-18
            //for (int j = 1; j <= 9; j++) {
            //    System.out.println("   " + (j + 8) + " - " + (j + 9)); // Print the time range
            //}
            i++;
        }
    }
}
