class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] frequency = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }
        
        for(int n : frequency){
            if(n != 0) return false;
        }
        
        return true;
    }
}