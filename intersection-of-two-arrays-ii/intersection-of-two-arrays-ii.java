class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        if(nums1.length > nums2.length){
            fillMap(map, nums1);
            fillList(map,list,nums2);
        }
        else{
            fillMap(map, nums2);
            fillList(map,list,nums1);
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
    
    
    public void fillMap(HashMap<Integer,Integer> map, int[] nums){
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
    }
    
    public void fillList(HashMap<Integer,Integer> map,List<Integer> list, int[] nums){
        for(int num : nums){
            if(map.containsKey(num)){
                if(map.get(num) > 0){
                    list.add(num);
                    map.put(num,map.get(num)-1);
                }
            }
        }
    }
}