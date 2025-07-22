class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (top != -1 && stack[top] == map.get(c))
                    top--;
                else
                    return false;
            } else {
                stack[++top] = c;
            }
        }
        return (top == -1);

    }
}