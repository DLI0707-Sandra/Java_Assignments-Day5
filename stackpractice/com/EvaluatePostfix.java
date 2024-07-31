package stackpractice.com;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostfix
{
        static int evaluatePostfix(String exp)
        {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < exp.length(); i++)
            {
                char c = exp.charAt(i);
                if (Character.isDigit(c))
                    stack.push(c - '0');
                else
                {
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    switch (c)
                    {
                        case '+':
                            stack.push(value2 + value1);
                            break;
                        case '-':
                            stack.push(value2 - value1);
                            break;
                        case '/':
                            stack.push(value2 / value1);
                            break;
                        case '*':
                            stack.push(value2 * value1);
                            break;
                    }
                }
            }
            return stack.pop();
        }
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the postfix expression:");
            String postfix=scanner.next();
            System.out.println("postfix evaluation: " + evaluatePostfix(postfix));
        }
}
