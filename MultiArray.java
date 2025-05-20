public class MultiArray 
{
    public static void main(String[] args)
    {
        // Declare a jagged array (array of arrays with different lengths)
        int nums[][] = new int[3][];  
        nums[0] = new int[3]; // First row with 3 elements
        nums[1] = new int[4]; // Second row with 4 elements
        nums[2] = new int[2]; // Third row with 2 elements

        // Populate the jagged array with random values between 0 and 99
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {  // Use nums[i].length to respect varying row sizes
                nums[i][j] = (int) (Math.random() * 100);  // Assign a random value between 0 and 99
            }
        }

        // Print the array using a regular for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums[i].length; j++) {  // Again, use nums[i].length to respect varying row sizes
                System.out.print(nums[i][j] + " ");  // Print each element in the row
            }
            System.out.println();  // Move to the next line after printing a row
        }

        // Print the array using the enhanced for loop (foreach)
        System.out.println("\nUsing enhanced for loop:");
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m + " ");  // Print each element
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}
