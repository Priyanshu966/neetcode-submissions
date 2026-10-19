class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        int startIndex = 0;
        int endIndex = nums.length;

        for(int i = 0; i < nums.length; i++){
            ans[startIndex] = nums[i];
            ans[endIndex] = nums[i];
            startIndex++;
            endIndex++;
        }

        return ans;
        
    }
}