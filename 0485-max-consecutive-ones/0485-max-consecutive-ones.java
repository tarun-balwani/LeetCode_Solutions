class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int countOfOne = 0;
        int maxNoOfOne = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                //countOfOne = countOfOne+1;
                countOfOne +=1;
            }
            else{
                maxNoOfOne = Math.max(countOfOne,maxNoOfOne);
                countOfOne = 0;
            }
        }
        return Math.max(countOfOne,maxNoOfOne);
    }
}