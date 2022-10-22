class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = answer.get(rowNum-1);
            
             row.add(1);
            
             for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            row.add(1);

            answer.add(row);
        }
        return answer;

    }
}