package mappractice.com;

import java.util.*;

public class DuplicatesCount
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            list.add(scanner.nextInt());
        }
        Map<Integer,Integer>frequency=new HashMap<>();

        for(int i:list)
        {
            if(!frequency.containsKey(i))
                frequency.put(i,1);
            else
            {
                int count=frequency.get(i)+1;
                frequency.put(i,count);
            }
        }

        for(Map.Entry<Integer,Integer>iterator:frequency.entrySet())
        {
            if(iterator.getValue()>1)
                System.out.println(iterator.getKey()+":"+iterator.getValue());
        }
    }
}
