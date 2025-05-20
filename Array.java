public class Array 
{
    public static void main(String[] args)
    {
        // Initialize the array
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // Corrected for loop with the variable 'i' instead of '1'
        for(int i = 0; i < 4; i++)
        {
            System.out.println(nums[i]); // Print each element of the array
        }
    }
}
