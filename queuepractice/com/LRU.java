package queuepractice.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LRU
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Queue<Integer>queue=new LinkedList<>();
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements in queue:");
        for(int i=0;i<number;i++)
            queue.add(scanner.nextInt());
        System.out.println("How many needs to be free:");
        int count=scanner.nextInt();
        for(int i=0;i<count;i++)
            queue.remove();
        System.out.println("Freed "+count+" numbers:");
        System.out.println("Now: "+queue);

    }
}
