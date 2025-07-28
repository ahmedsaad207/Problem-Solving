class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        ;
        while (!set.contains(n)) {
            set.add(n);

            n = sumSquares(n);

            if (n == 1)
                return true;
        }
        return false;

    }

    int sumSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}