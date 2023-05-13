class Solution {
    public int removeDuplicates(int[] nums) {
        
        //pointers to track elements in the array;
        int p1 = 0;
        int p2 = 0;
        
        //looping through the array, and using p2 to keep track of the current index
        while(p2 < nums.length){
            
            //both nums are same, just move ahead p2;
            if(nums[p1] == nums[p2]){
                p2++;
            }
            //when
            else{
                p1++;
                nums[p1] = nums[p2];
                p2++;
            }
        }
        
        return p1+1;
        
        
    }
}