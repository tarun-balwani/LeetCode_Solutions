class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        String lcp = "";
        for(int i = 0; i < strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(ch != strs[j].charAt(i)){
                    return lcp;
                }                
            }
            lcp+=ch;
        }
        return lcp;
    }
}