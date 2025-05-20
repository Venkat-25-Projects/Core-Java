public class Threedimensionalarray 
{
    public static void main(String[] args)
    {
        // Declare a 3D array with dimensions 3x3x3
        int[][][] nums = new int[3][3][3];

        // Populate the 3D array with random values between 0 and 99
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    nums[i][j][k] = (int) (Math.random() * 100);  // Random value between 0 and 99
                }
            }
        }

        // Print the array using a regular for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(nums[i][j][k] + " ");  // Print each element in the 3D array
                }
                System.out.println();  // Move to the next line after printing a row
            }
            System.out.println();  // Move to the next layer
        }

        // Print the array using enhanced for loop (foreach)
        System.out.println("\nUsing enhanced for loop:");
        int layerNumber = 1;
        for (int[][] layer : nums) {
            System.out.println("Layer " + layerNumber + ":");
            for (int[] row : layer) {
                for (int element : row) {
                    System.out.print(element + " ");  // Print each element
                }
                System.out.println();  // Move to the next line after printing a row
            }
            System.out.println();  // Move to the next layer
            layerNumber++;
        }
    }
}
