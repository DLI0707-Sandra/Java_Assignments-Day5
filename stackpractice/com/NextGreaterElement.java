package stackpractice.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            list.add(scanner.nextInt());
        }
        Stack<Integer>stack=new Stack<>();
        for(int i:list)
        {
            stack.push(i+1);
        }
        System.out.println("Next greater elements:");
        System.out.println(stack);
    }
}
