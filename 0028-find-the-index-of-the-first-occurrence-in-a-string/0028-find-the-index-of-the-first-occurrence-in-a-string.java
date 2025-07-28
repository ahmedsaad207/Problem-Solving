class Solution {
    public int strStr(String haystack, String needle) {

        // Using two pointers
        // int p = 0;
        // int index = -1;
        // for (int i=0; i<haystack.length(); i++) {
        //     if (haystack.charAt(i) == needle.charAt(p)) {
        //         if (p == 0) index = i;
        //         p++;
        //         if (p == needle.length()) return index;
        //     } else {
        //         if (p > 0) {
        //             i = index;
        //         }
        //         index = -1;
        //         p = 0;
        //     }
        // }

        // return -1;

        // Using substring
        // for (int i=0; i<haystack.length()-needle.length()+1; i++) {
        //     if (haystack.substring(i,i+needle.length()).equals(needle)) return i;
        // }
        // return -1;

        int ptr = 0, temp=-1;

        for (int i=0; i<haystack.length(); i++) {
            if (needle.charAt(ptr) == haystack.charAt(i)) {
                if (ptr == 0) temp=i;
                ptr++;
            }
            else {
                if (ptr>0) i= temp;
                ptr=0;
                temp = -1;
            }

            if (ptr==needle.length()) return temp;
        }

        return -1;

    }
    
}