class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
        
        int maxCapacity = Integer.MIN_VALUE;
        while(left < right){
            maxCapacity = Math.max((right-left) * Math.min(height[left],height[right]),maxCapacity);
            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxCapacity;
    }
}