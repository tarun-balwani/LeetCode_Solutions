class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }
    
    public void transpose(int [][] matrix){
        
        for(int row = 0; row < matrix.length; row++){
            for(int col = row+1; col < matrix[0].length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row]; 
                matrix[col][row] = temp; 
            }
        }
    }
    
    public void reflect(int [][] matrix){
        for(int row = 0; row < matrix.length; row++){
            int left = 0;
            int right = matrix[0].length-1;
            while(left < right){
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}