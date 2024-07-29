import java.util.*;

public class MaintainingOrder
{
    public static Set<String> maintainOrder(List<String>list)
    {
        Set<String>linked_hashset=new LinkedHashSet<>();

        for(String string:list)
        {
            linked_hashset.add(string);
        }
        return linked_hashset;
    }

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            list.add(scanner.next());
        }

        Set<String>linked_hashset=maintainOrder(list);

        System.out.println("In linked hashset:");
        for(String string:linked_hashset)
        {
            System.out.print(string+" ");
        }
    }
}
