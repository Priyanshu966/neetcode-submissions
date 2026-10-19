class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
 
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0) + 1);
        }

        int max = nums[0];
        int maxValue = count.get(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(count.get(nums[i]) > maxValue){
                max = nums[i];
                maxValue = count.get(nums[i]);
            }

        }

        return max;
        
    }
}