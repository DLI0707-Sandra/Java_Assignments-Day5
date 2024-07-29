import java.util.*;

public class SetBehaviour
{
    public static void main(String[] args)
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

        Set<Integer> hash_set=new HashSet<>();
        for(int i:list)
        {
            hash_set.add(i);
        }

        Set<Integer> linked_hashset=new LinkedHashSet<>();
        for(int i:list)
        {
            linked_hashset.add(i);
        }

        Set<Integer> tree_set=new TreeSet<>();
        for(int i:list)
        {
            tree_set.add(i);
        }

        System.out.println("Hashset:");
        for (int i:hash_set)
        {
            System.out.print(i+" ");
        }

        System.out.println("\nLinked Hashset:");
        for (int i:linked_hashset)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nTree set:");
        for (int i:tree_set)
        {
            System.out.print(i+" ");
        }

    }
}
