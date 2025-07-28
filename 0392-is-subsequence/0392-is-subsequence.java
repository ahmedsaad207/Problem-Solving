class Solution {
    public boolean isSubsequence(String s, String t) {

        int ptr=0;

        for (int i=0; i<t.length() && ptr<s.length(); i++) {
            if (t.charAt(i) == s.charAt(ptr)) ptr++;
        }
        return ptr == s.length();
    }
}