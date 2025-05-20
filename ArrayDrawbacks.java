/*public class ArrayDrawbacks {
    public static void main(String[] args) {
        
        // 1. **Fixed Size**: Once the array is created, its size cannot be changed.
        System.out.println("1. Fixed Size:");
        int[] fixedSizeArray = new int[5];
        fixedSizeArray[0] = 1;
        fixedSizeArray[1] = 2;
        fixedSizeArray[2] = 3;
        fixedSizeArray[3] = 4;
        fixedSizeArray[4] = 5;

        // Trying to access an index beyond the fixed size (will throw ArrayIndexOutOfBoundsException)
        try {
            fixedSizeArray[5] = 6; // This will throw an error!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Cannot add more elements than the array size (ArrayIndexOutOfBoundsException)");
        }

        System.out.println();

        // 2. **Inefficient Insertion/Deletion**: Inserting or deleting elements is inefficient because other elements need to be shifted.
        System.out.println("2. Inefficient Insertion/Deletion:");
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length + 1];

        // Insert element 10 at position 2 (need to shift elements)
        for (int i = arr.length - 1; i > 2; i--) {
            newArr[i + 1] = arr[i];
        }
        newArr[2] = 10; // Inserting at index 2
        newArr[0] = arr[0];
        newArr[1] = arr[1];

        System.out.print("Array after insertion: ");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();

        // 3. **Wasted Memory**: Unused spaces in large arrays consume memory.
        System.out.println("3. Wasted Memory:");
        int[] largeArray = new int[10]; // Size of 10, but only 3 elements are used
        largeArray[0] = 1;
        largeArray[1] = 2;
        largeArray[2] = 3;

        System.out.print("Array with wasted memory: ");
        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + " ");
        }
        System.out.println();

        System.out.println();

        // 4. **Homogeneity of Data**: Arrays can only store elements of the same data type.
        System.out.println("4. Homogeneity of Data (Using Object array to store different types):");
        Object[] mixedArray = new Object[3];
        mixedArray[0] = "Hello"; // String
        mixedArray[1] = 42;      // Integer
        mixedArray[2] = 3.14;    // Double

        System.out.print("Mixed data types in Object array: ");
        for (Object obj : mixedArray) {
            System.out.print(obj + " ");
        }
        System.out.println();

        System.out.println();

        // 5. **No Built-in Resizing**: You have to manually resize an array when it is full.
        System.out.println("5. No Built-in Resizing:");
        int[] smallArray = {1, 2, 3};
        // Manually create a new array with larger size
        int[] resizedArray = new int[smallArray.length + 2];
        System.arraycopy(smallArray, 0, resizedArray, 0, smallArray.length); // Copy elements to the new array
        resizedArray[3] = 4; // New element
        resizedArray[4] = 5; // New element

        System.out.print("Resized array: ");
        for (int i : resizedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();

        // 6. **Lack of Built-in Methods**: Arrays don't have built-in methods for common operations like sorting or searching.
        System.out.println("6. Lack of Built-in Methods:");
        int[] searchArray = {9, 2, 4, 7, 5};

        // Searching manually for the maximum value
        int max = searchArray[0];
        for (int i = 1; i < searchArray.length; i++) {
            if (searchArray[i] > max) {
                max = searchArray[i];
            }
        }

        System.out.println("Maximum value in array: " + max);

        System.out.println();

        // 7. **Limited Flexibility**: Arrays are static and do not support dynamic resizing or mixed data types.
        System.out.println("7. Limited Flexibility (Array is static):");
        int[] dynamicArray = new int[5]; // Size is fixed
        dynamicArray[0] = 1;
        dynamicArray[1] = 2;
        dynamicArray[2] = 3;

        // Attempt to change the size of the array at runtime (not possible)
        // We would need to manually create a new array and copy the data, as shown in the previous examples.

        System.out.println("The size of dynamicArray is fixed to " + dynamicArray.length);
        System.out.println("You cannot increase or decrease the size dynamically like in ArrayList or LinkedList.");

        System.out.println();
    }
}*/
