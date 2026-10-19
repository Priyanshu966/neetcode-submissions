class Solution {
    public int appendCharacters(String s, String t) {

        int i = 0;
        int k = 0;

        while(i < s.length() && k < t.length()){
            if(s.charAt(i) == t.charAt(k)){
                k++;
            }
            i++;
        }

        

        return t.length() - k;
        
    }
}