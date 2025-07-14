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

                if (needle.isEmpty()) return 0;

        int[] lps = buildLPS(needle);

        int i = 0; // haystack index
        int j = 0; // needle index

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

        private int[] buildLPS(String needle) {
        int[] lps = new int[needle.length()];
        int len = 0;
        int i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}