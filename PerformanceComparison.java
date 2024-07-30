import java.util.*;

public class PerformanceComparison
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> hash_set = new HashSet<>();
        Set<Integer> linked_hashset = new LinkedHashSet<>();
        Set<Integer> tree_set = new TreeSet<>();
        long hashset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hash_set.add(i + 1);
        }
        long hashset_end_time = System.nanoTime();
        long linkedhashset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linked_hashset.add(i + 1);
        }
        long linkedhashset_end_time = System.nanoTime();
        long treeset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            tree_set.add(i + 1);
        }
        long treeset_end_time = System.nanoTime();

        System.out.println("Insertion Performance:");
        System.out.println("Hash set:" + (hashset_end_time - hashset_start_time)+" nano seconds");
        System.out.println("Linked hash set:" + (linkedhashset_end_time - linkedhashset_start_time)+" nano seconds");
        System.out.println("Tree set:" + (treeset_end_time - treeset_start_time)+" nano seconds");

        System.out.println("Enter the number to be searched(1 to 1000000):");
        int number = scanner.nextInt();
        boolean found;
        hashset_start_time = System.nanoTime();
//        System.out.println(hashset_start_time);
        found=(hash_set.contains(number));
        hashset_end_time = System.nanoTime();
//        System.out.println(hashset_end_time);
        linkedhashset_start_time = System.nanoTime();
        found=linked_hashset.contains(number);
        linkedhashset_end_time = System.nanoTime();
        treeset_start_time = System.nanoTime();
        found=tree_set.contains(number);
        treeset_end_time = System.nanoTime();

        System.out.println("Search Performance:");
        System.out.println("Hash set:"+(hashset_end_time-hashset_start_time)+" nano seconds");
        System.out.println("Linked hash set:"+(linkedhashset_end_time-linkedhashset_start_time)+" nano seconds");
        System.out.println("Tree set:"+(treeset_end_time-treeset_start_time)+" nano seconds");


        hashset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hash_set.remove(i + 1);
        }
        hashset_end_time = System.nanoTime();
        linkedhashset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linked_hashset.remove(i + 1);
        }
        linkedhashset_end_time = System.nanoTime();
        treeset_start_time = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            tree_set.remove(i + 1);
        }
        treeset_end_time = System.nanoTime();

        System.out.println("Remove Performance:");
        System.out.println("Hash set:" + (hashset_end_time - hashset_start_time)+" nano seconds");
        System.out.println("Linked hash set:" + (linkedhashset_end_time - linkedhashset_start_time)+" nano seconds");
        System.out.println("Tree set:" + (treeset_end_time - treeset_start_time)+" nano seconds");


    }

}
