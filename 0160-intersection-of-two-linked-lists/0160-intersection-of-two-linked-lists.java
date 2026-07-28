/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA= headA;
        ListNode tempB= headB;
        Set<ListNode> Set= new HashSet<>();
        while(tempA!=null){
            Set.add(tempA);
            tempA = tempA.next;
        }
       while(tempB!=null){
            if(Set.contains(tempB)) return tempB;
            tempB=tempB.next;
        }
        return null;
    }
}