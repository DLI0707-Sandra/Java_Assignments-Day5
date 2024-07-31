package linkedlistpractice.com;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome
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

        boolean palindrome=true;
        for(int i=0;i<number/2;i++)
        {
            if(!linked_List.get(i).equals(linked_List.get(number-i-1)))
            {
                System.out.println("Not a palindrome!");
                palindrome=false;
                break;
            }
        }
        if(palindrome)
            System.out.println("Palindrome!");
    }
}
