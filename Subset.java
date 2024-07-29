import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset
{
    public static boolean subset(Set<Integer>set1,Set<Integer>set2)
    {
        boolean present=true;
        for (int i:set1)
        {
            if(!set2.contains(i))
            {
                present=false;
                break;
            }
        }
        return present;
    }

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        Set<Integer>list1=new HashSet<>();
        Set<Integer>list2=new HashSet<>();
        System.out.println("Enter the number of elements in the list:");
        int number1 =scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 0; i< number1; i++)
        {
            list1.add(scanner.nextInt());
        }
        System.out.println("Enter the number of elements in the list:");
        int number2=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number2;i++)
        {
            list2.add(scanner.nextInt());
        }

        if(subset(list1,list2))
            System.out.println("First list is a subset of second list!");
        else
            System.out.println("Not a subset");

    }
}
