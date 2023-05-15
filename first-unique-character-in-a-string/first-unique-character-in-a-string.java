class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i = 0; i < s.length(); i++){
            if(frequencyMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}