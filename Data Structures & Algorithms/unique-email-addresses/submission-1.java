class Solution {
    public String getValid(String email){
        StringBuilder valid = new StringBuilder();
        boolean isLocal = true;
        boolean isPlus = false;
        for(int i = 0; i < email.length(); i++){
            char ch = email.charAt(i);
            if(ch == '@'){
                isLocal = false;
                valid.append(ch);
                continue;
            }
            if(isLocal){
                if(isPlus) continue;

                if(ch == '.'){
                    continue;
                }else if(ch == '+'){
                    isPlus = true;
                    continue;
                }else{
                    valid.append(ch);
                }
            }else{
                valid.append(ch);
            }

        }
        return valid.toString();
    }
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            set.add(getValid(emails[i]));
        }

        return set.size();
        
    }
}