public class AssignmentTask01 {
    public static Stack conditionalReverse(Stack stack) {
         Stack n = new Stack();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if(n.isEmpty() || n.peek()!=cur) {
                n.push(cur);
            }
        }
        return n;
    }