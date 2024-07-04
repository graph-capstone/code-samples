import java.util.Arrays;

public class LongFunctionExample {

    public static void processArray(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        // Initialize variables
        int sum = 0;
        int product = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countEven = 0;
        int countOdd = 0;

        // Process array elements
        for (int num : arr) {
            // Sum
            sum += num;

            // Product
            product *= num;

            // Max
            if (num > max) {
                max = num;
            }

            // Min
            if (num < min) {
                min = num;
            }

            // Count even and odd numbers
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Print metrics
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("Even Count: " + countEven);
        System.out.println("Odd Count: " + countOdd);

        // Sort array
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));

        // Print array in reverse order
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find prime numbers
        System.out.print("Prime Numbers: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Find unique elements
        System.out.print("Unique Elements: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Calculate standard deviation
        double variance = 0;
        for (int num : arr) {
            variance += Math.pow(num - average, 2);
        }
        variance /= arr.length;
        double standardDeviation = Math.sqrt(variance);

        // Print standard deviation
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {12, 7, 5, 89, 34, 22, 17, 56, 3, 19};
        processArray(array);
    }
}
