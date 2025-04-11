public class SortUtility {
    public static void sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Proper swap with temp variable
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Print only once after sorting is complete
        System.out.println("Sorting complete!");
    }

    // Corrected main method (lowercase 'm')
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        // Fixed method name to match definition
        sortArray(numbers);
        
        // Fixed loop bounds to prevent array index out of bounds
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
