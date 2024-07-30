package mappractice.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeated
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String string=scanner.next();
        Map<Character,Integer> frequency=new HashMap<>();
        char[] charactes=string.toCharArray();
        for(char character:charactes)
        {
            if(!frequency.containsKey(character))
                frequency.put(character,1);
            else
            {
                int count=frequency.get(character)+1;
                frequency.put(character,count);
            }
        }

        for(Map.Entry<Character,Integer>iterator:frequency.entrySet())
        {
            if(iterator.getValue()==1)
            {
                System.out.println("First non repeating character:"+iterator.getKey());
                break;
            }
        }
    }
}
