class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length;i++){
            map.put(nums1[i],i);
        }

        for(int i = 0; i < nums1.length; i++){
            res[i] = -1;
        }
        Stack<Integer> s = new Stack<>();
        for(int num : nums2){
            while(!s.isEmpty() && num > s.peek()){
                int val = s.pop();
                int idx = map.get(val);
                res[idx] = num;

            }
            if(map.containsKey(num)){
                s.push(num);
            }
        }

        return res;

        
        
    }
}