package queuepractice.com;

import java.util.Queue;
import java.util.LinkedList;

public class StackImplementation
{
    static class Stack
    {
        static Queue<Integer> queue1 = new LinkedList<Integer>();
        static Queue<Integer> queue2 = new LinkedList<Integer>();

        static void push(int x)
        {
            queue2.add(x);
            while (!queue1.isEmpty())
            {
                queue2.add(queue1.peek());
                queue1.remove();
            }

            Queue<Integer> q = queue1;
            queue1 = queue2;
            queue2 = q;
        }

        static void pop()
        {
            if (queue1.isEmpty())
                return;
            queue1.remove();
        }

        static int top()
        {
            if (queue1.isEmpty())
                return -1;
            return queue1.peek();
        }

        static int size() { return queue1.size(); }
    }

    public static void main(String[] args)
    {
        StackImplementation.Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("current size: " + stack.size());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());

        System.out.println("current size: " + stack.size());
    }
}

