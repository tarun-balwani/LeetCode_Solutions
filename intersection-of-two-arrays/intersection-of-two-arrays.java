class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();
        Set<Integer> answerSet = new HashSet<>();
        
        for(int num : nums1){
            setNums1.add(num);
        }
        
        for(int num : nums2){
            setNums2.add(num);
        }
        
        for(int num : setNums1){
            if(setNums2.contains(num)){
                answerSet.add(num);
            }
        }
        
        int[] result = new int[answerSet.size()];
        
        if(answerSet.size() != 0){
            int i = 0;
            for(int num : answerSet){
                result[i] = num;
                i++;
            }
        }
        
      return result;
    }
}