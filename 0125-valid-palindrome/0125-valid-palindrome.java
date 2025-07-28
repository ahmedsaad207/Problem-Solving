class Solution {
    public boolean isPalindrome(String s) {

        // Solution 1, Add extra space
        // StringBuilder result = new StringBuilder();

        // for (int i=0; i<s.length(); i++) {
        //     char c = s.charAt(i);

        //     if (Character.isLetterOrDigit(c)) {
        //         result.append(Character.toLowerCase(c));
        //     }
        // }

        // for(int i=0; i<result.length()/2; i++) {
        //     if (result.charAt(i) != result.charAt(result.length()-i-1)) return false;
        // }

        // return true;

        // Solution 2 - no extra space
        int l=0,r=s.length()-1;

        while (l<r) {
            
            while (l<r && !isLetterOrDigit(s.charAt(l))) l++;
            while (l<r && !isLetterOrDigit(s.charAt(r))) r--;

            if (toLowerCase(s.charAt(l)) != toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
        
    }

    boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || 
                 c >= 'A' && c <= 'Z' || 
                 c >= '0' && c <= '9';
    }

    char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c+32);
        }
        return c;
    }
}