public class Nested {
    public static void main(String[] args) {
        int i = 1;  // Declare and initialize the variable i
        
        // Outer while loop
        while (i <= 4) {
            System.out.println("HI " + i);  // Added space after "HI" for better formatting
            
            int j = 1;  // Declare and initialize the variable j
            
            // Inner while loop
            while (j <= 3) {
                System.out.println("Hello " + j);  // Added space after "Hello"
                j++;  // Increment j
            }
            i++;  // Increment i
        }
        
        // Final output after the loops end
        System.out.println("Bye " + i);  // Added space after "Bye"
    }
}
