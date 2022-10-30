class Solution {
    public void rotate(int[] nums, int k) {
        int totalRotations = k % nums.length;
        
        int i = 0;
        int j = nums.length-1;
        int temp = 0;
        
        //reversing the i/p array
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        
        i = totalRotations;
        j = nums.length-1;
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        
        i = 0;
        j = totalRotations-1;
        while(i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        
        for(int a: nums){
            System.out.println(a);
        }
    
    
    }
}