import java.util.*;

public class FirstNonDuplicate
{
    public static int firstNonDuplicate(List<Integer>list)
    {
        Set<Integer> linked_hashset=new LinkedHashSet<>();
        Set<Integer> duplicates=new LinkedHashSet<>();
        for(int i=0;i<list.size();i++)
        {
            if(linked_hashset.contains(list.get(i)))
            {
                duplicates.add(list.get(i));
            }
            else
            {
                linked_hashset.add(list.get(i));
            }
        }
        linked_hashset.removeAll(duplicates);

        Iterator<Integer> iterator=linked_hashset.iterator();
        int index=0;
        return iterator.next();
    }

    public static void main(String [] args)
    {
        List<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            list.add(scanner.nextInt());
        }

        int non_duplicate=firstNonDuplicate(list);
        System.out.println(non_duplicate);
    }
}
