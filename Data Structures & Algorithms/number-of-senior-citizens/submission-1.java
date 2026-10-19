class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(int i = 0; i < details.length; i++){
            int n = details[0].length();
            String age = details[i].substring(n - 4,n - 2);

            if(Integer.valueOf(age) > 60){
                count++;
            }
        }
        return count;
        
    }
}