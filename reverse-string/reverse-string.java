class Solution {
    public void reverseString(char[] s) {
         int startIndex = 0;
        int endIndex = s.length-1;
        
        while(startIndex < endIndex){
            char temp = s[endIndex];
            s[endIndex] = s[startIndex];
            s[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}