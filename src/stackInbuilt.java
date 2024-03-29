import java.util.*;

public class stackInbuilt {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(90);
//        stack.push(89);
//        stack.push(88);
//        stack.push(87);
//        stack.push(86);
//        System.out.println(stack);
//
//        stack.size();
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack);
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(12);
//        queue.add(13);
//        queue.add(14);
//        queue.add(15);
//        queue.add(16);
//        queue.add(17);
//
//        System.out.println(queue.offer(89));
//        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(90);
        deque.addFirst(89);
        deque.addLast(91);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }
}
