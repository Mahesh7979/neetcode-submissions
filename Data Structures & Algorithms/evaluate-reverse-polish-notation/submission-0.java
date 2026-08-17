class Solution {
    public int evalRPN(String[] tokens) {
        // tokens = ["1","2","+","3","*","4","-"]
        // initialize a stack
        // 1 -> add to the stack
        // [1]
        // 2 -> add to the stack
        // [1,2]
        // + -> operator so perform the operation for top 2 elements
        // [3]
        // 3 -> add to the stack
        // [3,3]
        // * -> operator so perform the operation for top 2 elements
        // [9]
        // 4 -> add to the stack
        // [9,4]
        // - -> operator so perform the operation for top 2 elements
        // [5]

        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                result = switch (s) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1* num2;
                    case "/" -> num1 / num2 ;
                    default -> 0;
                };
            } else {
                result = Integer.parseInt(s);
            }
            stack.push(result);
        }
        return stack.pop();
    }
}
