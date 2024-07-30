import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemovewithCondition
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        Set<Integer>set=new TreeSet<>();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
        {
            set.add(scanner.nextInt());
        }
        System.out.println("Enter the threshold:");
        int threshold=scanner.nextInt();
        Set<Integer>new_set=new TreeSet<>();
        for(int i:set)
        {
            if(i>=threshold)
                new_set.add(i);
        }

        System.out.println(new_set);
    }
}
