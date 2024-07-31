package linkedlistpractice.com;

import java.util.Scanner;

public class RemoveAllOccuances
{
    public static void main(String[] args)
    {
        LinkedList linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int value=scanner.nextInt();
        for (int i=0;i<value;i++) {
            linkedList.addNode(linkedList, scanner.nextInt());
        }
        System.out.println("Enter the element to be removed:");
        int element=scanner.nextInt();

        Node temp = linkedList.head, prev = null;

        while (temp != null && temp.value == element)
        {
            linkedList.head = temp.next;
            temp = linkedList.head;
        }

        while (temp != null) {

            while (temp != null && temp.value != element) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null)
                return;

            prev.next = temp.next;

            temp = prev.next;
        }

        LinkedList.viewList(linkedList);
    }
}
