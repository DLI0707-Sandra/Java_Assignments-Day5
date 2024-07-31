package stackpractice.com;

import java.util.Scanner;
import java.util.Stack;

public class QueueImplementation
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();
        static void enQueue(int x)
        {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        static int deQueue()
        {
            if (s1.isEmpty())
            {
                return -1;
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Enque\n2.Deque\n3.Exit");
            System.out.println("Enter the choice:");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the element:");
                    Queue.enQueue(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Deleted element:"+ Queue.deQueue());
                    break;
                case 3:
                    System.out.println("Exiting!");
                    break;
            }

        }while (choice!=3);

    }
}
