package stackpractice.com;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=scanner.next();
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<input.length();i++)
        {
            if(stack.empty())
                stack.push(input.charAt(i));
            else if(input.charAt(i)==')')
            {
                if(stack.peek()=='(')
                    stack.pop();
                else
                    stack.push(')');
            }
            else if(input.charAt(i)=='(')
                stack.push('(');

        }

        if(stack.empty())
            System.out.println("Balanced!");
        else
            System.out.println("Not balanced!");
    }
}
