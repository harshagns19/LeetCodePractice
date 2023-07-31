package LinkedLists;

public class MiddleOfLinkedListLC876 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


        ListNode middle = middleNode(node1);
    }

    private static ListNode middleNode(ListNode head) {

        // Initialize two pointers slow and fast pointing to the head.
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            // In each iteration, we move slow one node forward and we move fast two nodes forward.
            slow = slow.next;
            fast = fast.next.next;
        }
        // When fast reaches the last node, slow will be exactly at the middle point.
        return slow;

        /*
        My pseudo code
         int count = 0;
        int count1=1;
        ListNode firstNode = head;
        while(head!=null){
            count++;
            head = head.next;
        }
        while(firstNode!=null){
            if(count1 == (count/2)+1){
                return firstNode;
            }
            count1++;
            firstNode = firstNode.next;
        }
        return head;
         */
    }
}
