class Solution {
    public int lengthOfLastWord(String s) {

        int end = s.length();
        int length = 0;
        boolean isFound = false;

        for(int i = end - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                isFound = true;
                length += 1;
            }else if(isFound == true && s.charAt(i) == ' '){
                break;
            }

            


        }

        return length;
        
    }
}