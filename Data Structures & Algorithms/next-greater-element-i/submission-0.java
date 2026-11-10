class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        int count = 0;
        for(int i : nums1){
            
            int greater = -1;
            boolean isFound = false;
            for(int j: nums2){
                if(isFound && j > i){
                    greater = j;
                    break;  
                }
                if(j == i){
                    isFound = true;
                }
                
            }
            res[count] = greater;
            count++;
        }
        return res;
        
    }
}