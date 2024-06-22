public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target) {
        // Iterate through each element in the array
        for (int num : arr) {
            // Check if the current element is equal to the target
            if (num == target) {
                return true; // Target found, return true
            }
        }
        return false; // Target not found after checking all elements, return false
    }
}
