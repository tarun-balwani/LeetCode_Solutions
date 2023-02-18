class Solution {
    public void reverseString(char[] s) {
// Iterative approach
//          int startIndex = 0;
//         int endIndex = s.length-1;
        
//         while(startIndex < endIndex){
//             char temp = s[endIndex];
//             s[endIndex] = s[startIndex];
//             s[startIndex] = temp;
//             startIndex++;
//             endIndex--;
//         }
        
        // recursive approach
        reversedString(s, 0, s.length-1);
    }
    
    public void reversedString(char[] s, int left, int right){
        if(left >= right) return;
        
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
            reversedString(s, left,right);        
    }
}