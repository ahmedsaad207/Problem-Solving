class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder result = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);


            if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isDigit(c)) {
                result.append(c);
            }
        }

        for(int i=0; i<result.length()/2; i++) {
            if (result.charAt(i) != result.charAt(result.length()-i-1)) return false;
        }

        return true;
        
    }
}