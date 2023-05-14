class Solution {
    public void moveZeroes(int[] nums) {
     int[] ans = new int[nums.length];
     int pointer = 0;
        
       for(int n : nums){
           if(n != 0){
               ans[pointer] = n;
               pointer++;
           }
       }
    
        for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }
        for(int i = 0; i < ans.length; i++){
            nums[i] = ans[i];
        }
    }
}