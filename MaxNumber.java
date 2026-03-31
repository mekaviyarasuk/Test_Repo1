public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 10};
        
        // Edge case: check if array is empty
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize max with the first element
        int max = numbers[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}