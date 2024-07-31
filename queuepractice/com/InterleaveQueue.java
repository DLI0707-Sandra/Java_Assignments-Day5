package queuepractice.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterleaveQueue
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        System.out.println("Enter the number of elements(even number):");
        int number=scanner.nextInt();
        System.out.println("Enter the elements in queue:");
        for(int i=0;i<number;i++)
            queue.add(scanner.nextInt());
        int half=number/2;
        Queue<Integer> temporary_queue=new LinkedList<>();
        int count=0;
        while (count<half)
        {
            temporary_queue.add(queue.peek());
            queue.remove();
            count++;
        }

        while(!temporary_queue.isEmpty())
        {
            queue.add(temporary_queue.peek());
            temporary_queue.remove();
            queue.add(queue.peek());
            queue.remove();
        }

        System.out.println(queue);
    }
}
