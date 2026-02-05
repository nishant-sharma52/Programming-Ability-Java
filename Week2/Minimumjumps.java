class Solution {

    static int minJumps(int[] arr){

        int jumps=1,steps=arr[0],maxReach=arr[0];

        for(int i=1;i<arr.length-1;i++){
            maxReach=Math.max(maxReach,i+arr[i]);
            steps--;
            if(steps==0){
                jumps++;
                steps=maxReach-i;
            }
        }
        return jumps;
    }
}
