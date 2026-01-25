public class Experiment7_MaxSubarray {

    // Print all subarrays
    static void printSubarray(int arr[]) {

        int n = arr.length;

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {

                for(int i = start; i <= end; i++)
                    System.out.print(arr[i]);

                System.out.print(", ");
            }
            System.out.println();
        }
    }

    // Brute Force O(n^3)
    static void maxSubarraySum1(int arr[]) {

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {

                int currSum = 0;

                for(int i = start; i <= end; i++)
                    currSum += arr[i];

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Brute Force Max Sum = " + maxSum);
    }

    // Optimized O(n^2)
    static void maxSubarraySum2(int arr[]) {

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start < n; start++) {

            int currSum = 0;

            for(int end = start; end < n; end++) {
                currSum += arr[end];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Optimized Max Sum = " + maxSum);
    }

    // Kadane’s Algorithm O(n)
    static void maxSubarraySum3(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++) {

            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0)
                currSum = 0;
        }

        System.out.println("Kadane Max Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int arr[] = {2, -3, 6, -5, 4, 2};

        // printSubarray(arr);

        maxSubarraySum1(arr);
        maxSubarraySum2(arr);
        maxSubarraySum3(arr);
    }
}
