package LinkedLists;

/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
 */
public class ConverBinarytoLinkedListIntegerLC1290 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();

        //assign values to the linked list elements
        l1.val = 1;
        l2.val = 0;
        l3.val = 1;

        //To fill in the pointers between them and link them together:
        l1.next = l2;
        l2.next = l3;

        ListNode head = l1;
        int decimalValue = getDecimalValue(head);
        System.out.println("decimalValue is "+decimalValue);
    }

    public static int getDecimalValue(ListNode head) {
        StringBuffer sb = new StringBuffer();
        if(head == null){
            return 0;
        }
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }

        /* other solution
         StringBuffer sb = new StringBuffer();
        int sum = 0;
        while(head != null){
                sb.append(head.val);
                sum = (2*sum)+head.val;
                head = head.next;

        }
    return sum;
         */
        return Integer.parseInt(sb.toString(),2);
    }


}
