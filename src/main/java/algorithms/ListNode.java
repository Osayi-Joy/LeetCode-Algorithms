package algorithms;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListNode {


     // Definition for singly-linked list.

     int val;
     ListNode next;



        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;
            // Move fast pointer n steps ahead
            for (int i = 0; i < n; i++) {
                if (fast.next == null) {
                    // If n is equal to the number of nodes, delete the head node
                    if (i == n - 1) {
                        head = head.next;
                    }
                    return head;
                }
                fast = fast.next;
            }
            // Loop until we reach to the end.
            // Now we will move both fast and slow pointers
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            // Delink the nth node from last
            if (slow.next != null) {
                slow.next = slow.next.next;
            }
            return head;
        }
    }




