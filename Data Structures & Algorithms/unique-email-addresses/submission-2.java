class Solution {
    public String getValid(String email){
        StringBuilder valid = new StringBuilder();
        int i = 0;
        
        while(i < email.length() && email.charAt(i) != '+'){
            if(email.charAt(i) != '.'){
                valid.append(email.charAt(i));
            }
            i++;
        }
        while(i < email.length() && email.charAt(i) != '@'){
            i++;
        }
        valid.append(email.substring(i));
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