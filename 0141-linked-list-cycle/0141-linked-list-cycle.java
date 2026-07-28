/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> Set= new HashSet<>();
        ListNode current = head;
        while(current!=null){
            if(Set.contains(current))
            return true;
        Set.add(current);
        current= current.next;
        }
        return false;
    }
}