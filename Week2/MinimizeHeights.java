import java.util.*;

class Solution {
    int getMinDiff(int[] arr, int k) {

        int n = arr.length;
        if(n==1) return 0;

        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n-1] - k;

        if(small > big){
            int temp = small;
            small = big;
            big = temp;
        }

        for(int i=1;i<n-1;i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if(subtract < 0) continue;

            int mn = Math.min(small, subtract);
            int mx = Math.max(big, add);

            ans = Math.min(ans, mx - mn);
        }

        return ans;
    }
}
