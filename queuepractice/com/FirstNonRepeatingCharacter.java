package queuepractice.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String string=scanner.next();
        Queue<Character>queue=new LinkedList<>();
        char[] characters=string.toCharArray();
        int[] frequency=new int[26];
        for(char character:characters)
        {
            queue.add(character);
            frequency[character-'a']++;
        }
        boolean change=false;
        while(!queue.isEmpty())
        {
            if(frequency[queue.peek()-'a']>1)
            {
                queue.remove();
            }
            else
                break;
        }

        System.out.println(queue.peek());

    }
}
