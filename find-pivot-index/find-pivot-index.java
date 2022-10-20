class Solution {
    public int pivotIndex(int[] nums) {
         int lSum = 0;
        int rSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            lSum = (i == 0) ? 0: calcLeftSum(i,nums);
            rSum = (i == nums.length -1 ) ? 0: calRightSum(i+1,nums);
            
            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }
    
    public int calcLeftSum(int index, int[] numsArr){
        int sum = 0;
        for(int i = 0; i< index; i++){
            sum+=numsArr[i];
        }
        return sum;
    }
    
    public int calRightSum(int index, int[] numsArr){
        int sum = 0;
        for(int i = index; i< numsArr.length; i++){
            sum+=numsArr[i];
        }
        return sum;
    }
}