package stackpractice.com;

import java.util.Scanner;
import java.util.Stack;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            stack.push(scanner.nextInt());
        }
        System.out.println("Entered stack:"+stack);
        Stack<Integer>stack1=new Stack<>();
        while(!stack.empty())
        {
            stack1.push(stack.peek());
            stack.pop();
        }
        stack.removeAllElements();
        Stack<Integer>stack2=new Stack<>();
        while(!stack1.empty())
        {
            stack2.push(stack1.peek());
            stack1.pop();
        }

        while (!stack2.empty())
        {
            stack.push(stack2.peek());
            stack2.pop();
        }
        System.out.println("After reversal:"+stack);

    }
}
