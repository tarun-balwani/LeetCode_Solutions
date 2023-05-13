class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        //reverse the entire array
        reverse(nums, 0, nums.length-1);
        //reversing the first k elements in the reversed array
        reverse(nums, 0,k-1);
        //reverse the elements after K to the end
        reverse(nums,k,nums.length-1);
    }
    
    public void reverse(int[] nums,int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
            
        }
    }
}