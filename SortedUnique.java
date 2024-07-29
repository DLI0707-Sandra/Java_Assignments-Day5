import java.util.*;

public class SortedUnique
{
    public static Set<Integer> sortedUnique(List<Integer>list)
    {
        Set<Integer> tree_set =new TreeSet<>();

        for(int i:list)
        {
            tree_set.add(i);
        }
        return tree_set;
    }

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
        Set<Integer>tree_set=sortedUnique(list);
        System.out.println(tree_set);
    }

}
