class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");

        if(sArr.length != pattern.length()){
            return false;
        }

        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        for(int i = 0; i < sArr.length; i++){
            char ch = pattern.charAt(i);
            String word = sArr[i];
            if(map1.containsKey(ch) && map2.containsKey(word)){
                if(!map1.get(ch).equals(word) || !map2.get(word).equals(ch)){
                    return false;
                }

            }else if(!map1.containsKey(ch) && !map2.containsKey(word)){
                map1.put(pattern.charAt(i),sArr[i]);
                map2.put(sArr[i],pattern.charAt(i));
            }else{
                return false;
            }
            
        }

        return true;
        
    }
}