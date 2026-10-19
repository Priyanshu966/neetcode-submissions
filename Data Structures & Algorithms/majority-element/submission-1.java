class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
 
        int max = 0;
        int maxValue = 0;
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0) + 1);
            if(count.get(nums[i]) > maxValue){
                max = nums[i];
                maxValue = count.get(nums[i]);
            }
        }

        
       

        return max;
        
    }
}