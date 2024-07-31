package linkedlistpractice.com;

import java.util.LinkedList;
import java.util.Scanner;

public class RmoveNthfromEnd
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Integer> linked_List=new LinkedList<>();
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the values:");
        for(int i=0;i<number;i++)
        {
            linked_List.addLast(scanner.nextInt());
        }
        System.out.println("Current linked list:");
        System.out.println(linked_List);
        System.out.println("Enter the position:");
        int position=scanner.nextInt();
        int from_beginning=number-position+1;
        for(int i=0;i<number;i++)
        {
            if(i==from_beginning-1)
                linked_List.remove(i);
        }

        System.out.println("New linked list:");
        System.out.println(linked_List);

    }
}
