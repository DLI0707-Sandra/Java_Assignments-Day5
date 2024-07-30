package mappractice.com;

import java.util.*;

public class SortbyValue
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        System.out.println("Enter the number of elements");
        int number=scanner.nextInt();
        System.out.println("Enter the values:");
        for(int i=0;i<number;i++)
        {
            System.out.println("Key:");
            String key=scanner.next();
            System.out.println("Value:");
            int value= scanner.nextInt();
            map.put(key,value);
        }
        List<Integer>list=new ArrayList<>();
        for (Map.Entry<String,Integer> iterator: map.entrySet())
        {
            list.add(iterator.getValue());
        }
        int[] array =new int[list.size()];
        int index=0;
        for(int i:list)
        {
            array[index++]=i;
        }
        Arrays.sort(array);
        Map<String,Integer>sorted_map=new LinkedHashMap<>();
        for(int i:array)
        {
            for (Map.Entry<String,Integer> iterator:map.entrySet())
            {
                if(i==iterator.getValue())
                {
                    sorted_map.put(iterator.getKey(), iterator.getValue());
                }
            }
        }
        for (Map.Entry<String,Integer> iterator:sorted_map.entrySet())
        {
            System.out.println(iterator.getKey()+":"+iterator.getValue());
        }

    }
}
