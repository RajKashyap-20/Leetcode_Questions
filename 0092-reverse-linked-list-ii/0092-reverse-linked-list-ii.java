/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = head;

        for (int i = 1; i < left; i++) {
            slow = fast;
            fast = fast.next;
        }

        ListNode tail = fast;
        ListNode prev = null;

        for (int i = left; i <= right; i++) {
            ListNode next = fast.next;
            fast.next = prev;
            prev = fast;
            fast = next;
        }

        slow.next = prev;
        tail.next = fast;

        return dummy.next;
    }
}