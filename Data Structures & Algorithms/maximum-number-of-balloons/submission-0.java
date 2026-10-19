class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character,Integer> frequency = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0) + 1);
        }
        String bln = "balloon";
        int count = 0;
        boolean isPossible = true;
        while(isPossible){
            
            for(int i = 0; i < bln.length(); i++){
                char ch = bln.charAt(i);
                if(frequency.containsKey(ch) && frequency.get(ch) > 0){
                    frequency.put(ch,frequency.get(ch) - 1);
                }else{
                    isPossible = false;
                    break;
                }

            }
            if(isPossible){
                count++;
            }

        }
        return count;

        
    }
}