class Solution {
    public int dominantIndex(int[] nums) {
         int max = 0;
        int index = 0;
        boolean isAtLeastTwice = false;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        
       for(int x : nums){
           if(x != max && max < 2*x){
               return -1;
           }
       }
      return index;  
    }
}