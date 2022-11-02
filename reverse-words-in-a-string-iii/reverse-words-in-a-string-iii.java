class Solution {
    public String reverseWords(String s) {
         StringBuilder sb = new StringBuilder();
        char [] sToArray = s.toCharArray();
        int j = 0;
        
        for(int i = 0; i < sToArray.length - 1; i++){
            if(sToArray[i+1] == ' ' || i+1 == sToArray.length-1){
                if(i+1 == sToArray.length-1)
                { 
                    reverse(sToArray,j,i+1); 
                } else{
                    reverse(sToArray,j,i);
                }
                j = i+2;
            }
        }
        
        for(char c : sToArray){
            sb.append(c);
        }
        
        return sb.toString();
        
    }
    
    public void reverse(char[] arr, int startIndex, int endIndex){
        while(startIndex < endIndex){
            char temp = arr[endIndex];
            arr[endIndex] = arr[startIndex];
            arr[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}