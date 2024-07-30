import java.util.*;

public class Intersection {

    public static void main(String[] args)
    {
        List<Set<Integer>>list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int number=scanner.nextInt();

        for (int i=0;i<number;i++)
        {
            Set<Integer>set=new TreeSet<>();
            System.out.println("Enter the number of elements");
            int size=scanner.nextInt();
            System.out.println("Enter the elements:");
            for(int j=0;j<size;j++)
            {
                set.add(scanner.nextInt());
            }
            list.add(set);
        }
        System.out.println(list);
        int common=0;

        for(Set<Integer>set1:list)
        {
            for(int i:set1)
            {
                boolean yes =true;
//                System.out.println(i);
                for(Set<Integer>set2:list)
                {
                    if(!set2.contains(i))
                        yes =false;
                }
                if(yes)
                {
                    common=i;
//                    System.out.println(common);
                    break;
                }
            }
        }

        System.out.println(common);
    }

}
