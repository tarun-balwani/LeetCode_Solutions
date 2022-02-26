class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) != null) return true;
            else{
                map.put(nums[i], map.get(nums[i]) == null ? 0 : map.get(nums[i])+1);
            }
        }
        return false;
        
    }
}