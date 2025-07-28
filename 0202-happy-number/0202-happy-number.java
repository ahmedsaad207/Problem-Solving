class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        int digit;
        while (!set.contains(n)) {
            set.add(n);
            
            int output = 0;

            while(n != 0) {
                digit = n % 10;
                output += digit * digit;
                n /= 10;
            }
            n = output;

            if (n == 1) return true;
        }
        return false;

    }
}