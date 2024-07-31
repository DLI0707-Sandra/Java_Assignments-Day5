package linkedlistpractice.com;

import java.util.Scanner;

class Node {
    int value;
    Node next;
    Node(int d)
    {
        value = d;
        next = null;
    }
}

class LinkedList
{
    Node head;
    public static void addNode(LinkedList list, int value)
    {
        Node newNode = new Node(value);
        if (list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = newNode;
        }
    }
    public static void viewList(LinkedList list)
    {
        Node currentNode = list.head;
        while (currentNode != null)
        {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

}

public class MergeSortedList
{

    public static Node mergeTwoLists(Node list1, Node  list2) {

        if(list1!=null && list2!=null){
            if(list1.value<list2.value){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }

    public static void main(String[] args)
    {
        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int value=scanner.nextInt();
        for (int i=0;i<value;i++) {
            linkedList1.addNode(linkedList1, scanner.nextInt());
        }
//        LinkedList.viewList(linkedList1);
        System.out.println("Enter the number of elements:");
        int value2 =scanner.nextInt();
        for (int i = 0; i< value2; i++) {
            linkedList2.addNode(linkedList2, scanner.nextInt());
        }
        Node new_head=mergeTwoLists(linkedList1.head,linkedList2.head);
        LinkedList merged=new LinkedList();
        merged.head=new_head;
        LinkedList.viewList(merged);
    }

}
