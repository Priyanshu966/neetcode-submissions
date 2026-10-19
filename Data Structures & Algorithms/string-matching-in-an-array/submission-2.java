class Solution {
    public boolean checkSub(String s1, String s2){
        if(s1.length() == 0){
            return true;
        }
        if(s1.length() > s2.length()){
            return false;
        }

        int count = 0;
        boolean isFound = false;

        for(int i = 0; i < s2.length(); i++){
            if(!isFound){
                   if(s2.charAt(i) == s1.charAt(count)){
                       isFound = true;
                       count++;
                   }
            }else{
                if(count == s1.length()){
                    return true;
                }else if(s1.charAt(count) != s2.charAt(i)){
                    return false;
                }else{
                    count++;
                }


            }
         

        }
        if(count == s1.length()){
            return true;
        }
        return false;

    }
    public List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(j == i){
                    continue;
                }
                if(words[j].contains(words[i])){
                    if(!result.contains(words[i])){
                        result.add(words[i]);
                    }
                    
                }
                

            }
        }

        return result;
        
    }
}