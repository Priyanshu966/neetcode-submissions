class Solution {
    public int scoreOfString(String s) {

        int sum = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int diff = s.charAt(i) - s.charAt(i + 1);

            if(diff < 0){
                diff = diff * -1;
            }
            sum += diff;
        }

        return sum;
        
    }
}