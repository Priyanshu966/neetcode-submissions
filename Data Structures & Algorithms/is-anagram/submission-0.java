class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[256];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)] += 1;
        }

        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i)] -= 1;

            if(arr[t.charAt(i)] < 0){
                return false;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;

    }
}
