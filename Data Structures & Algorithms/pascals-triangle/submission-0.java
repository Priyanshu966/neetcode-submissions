class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            int value = 1;
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                row.add(value);
                value = value * (i - j) / (j + 1);
            }
            result.add(row);
        }

        return result;
        
    }
}