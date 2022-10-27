class Solution {
    public String longestCommonPrefix(String[] strs) {
        // method one using horizontal approach
        
//         String prefix = strs[0];
        
//         for(int i = 1; i < strs.length; i++){
//             while(strs[i].indexOf(prefix) != 0){
//                 prefix = prefix.substring(0,prefix.length()-1);
//             }
//         }
//         return prefix;
        
        // Approach 2: Using vertical approach
        
        String lcp = "";
        
        if(strs == null || strs.length == 0){
            return lcp; 
            }
        
        int index = 0;
        
        for(char c : strs[0].toCharArray()){
            for(int i = 1; i < strs.length; i++){
                if(index >= strs[i].length() || c != strs[i].charAt(index)){
                    return lcp;
                }
            }
        
            lcp += c;
            index++;
        }
        
        return lcp;
    }
}