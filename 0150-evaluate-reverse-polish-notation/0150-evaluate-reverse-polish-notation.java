class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;

        for (String s : tokens) {
            switch(s) {
                case "+":
                    stack[top-1] = stack[top-1] + stack[top];
                    top--;
                    break;
                case "*":
                    stack[top-1] = stack[top-1] * stack[top];
                    top--;
                    break;
                case "-" :
                    stack[top-1] = stack[top-1] - stack[top];
                    top--;
                    break;
                case "/" :
                    stack[top-1] = stack[top-1] / stack[top];
                    top--;
                    break;
                default: 
                    stack[++top] = Integer.parseInt(s);
            } 
        }



        return stack[top];
        
    }
}