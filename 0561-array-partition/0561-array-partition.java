class Solution {
    public int arrayPairSum(int[] nums) {
        int temporary;
        int maxSum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] > nums[j]) {
        //             temporary = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temporary;
        //         }
        //     }
        // }
        Arrays.sort(nums);
        
       for(int i = 0; i < nums.length -1; i+=2){
           maxSum = maxSum + nums[i];
       }
        return maxSum;
    }
}