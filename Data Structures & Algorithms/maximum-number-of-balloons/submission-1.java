class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> frequency = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0) + 1);
        }

        HashMap<Character,Integer> balloon = new HashMap<>();

        for(char ch : "balloon".toCharArray()){
            balloon.put(ch,balloon.getOrDefault(ch,0) + 1);
        }
        
        int ans = text.length();
        for(char ch : balloon.keySet()){
            ans = Math.min(ans,frequency.getOrDefault(ch,0) / balloon.get(ch));
        }
        return ans;
        
    }
}