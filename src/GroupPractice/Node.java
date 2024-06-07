package GroupPractice;

public class Node {

    public ListNode intersectionNode(ListNode head1, ListNode head2) {

        if (head1 == null || head2 == null) {
            return null;
        }

        ListNode nodeA = head1;
        ListNode nodeB = head2;

        while (nodeA != nodeB) {
            nodeA = (nodeA == null) ? nodeB : nodeA.next;
            nodeB = (nodeB == null) ? nodeA : nodeB.next;


        }
        return nodeA;

    }
}
