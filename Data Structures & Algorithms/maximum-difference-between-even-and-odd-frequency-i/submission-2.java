class Solution {
    public int maxDifference(String s) {

        int[] frequency = new int[26];

        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i) - 'a'] += 1;
        }

        int even = s.length();
        int odd = 0;

        for(int c : frequency){
            if(c == 0){
                continue;
            }else if(c % 2 == 0 && c < even){
                even = c;
            }else if(c % 2 != 0 && c > odd){
                odd = c;
            }

        }

        return odd - even;
        
    }
}