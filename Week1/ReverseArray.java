class Solution {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int idx = 0;

        for(int i = n - 1; i >= 0; i--) {
            temp[idx++] = arr[i];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
