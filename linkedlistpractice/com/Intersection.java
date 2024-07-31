package linkedlistpractice.com;

public class Intersection
{

    static class Node {
        int value;
        Node next;
        Node(int d)
        {
            value = d;
            next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2)
    {
        while (head2 != null)
        {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Intersection intersection=new Intersection();
        Node head1, head2;
        head1 = new Node(1);
        head2 = new Node(2);

        Node newNode = new Node(3);
        head2.next = newNode;

        newNode = new Node(3);
        head2.next.next = newNode;

        newNode = new Node(5);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(6);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint
                = intersection.getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.print("No Intersection Point!\n");
        }
        else {
            System.out.print("Intersection Point: "
                    + intersectionPoint.value);
        }


    }


}
