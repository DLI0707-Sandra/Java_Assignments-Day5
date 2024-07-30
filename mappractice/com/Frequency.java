package mappractice.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String string=scanner.next();
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<string.length();i++)
        {
            if(!map.containsKey(string.charAt(i)))
                map.put(string.charAt(i),1);
            else
            {
                int count=map.get(string.charAt(i));
                map.put(string.charAt(i),++count);
            }
        }
        System.out.println(map);
    }
}
