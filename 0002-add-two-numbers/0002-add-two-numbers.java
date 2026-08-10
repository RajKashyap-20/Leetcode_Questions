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
public class Solution {

    public ListNode crearNodo(int val) {
        ListNode nodo = new ListNode(val);
        return nodo;
    }

    public ListNode insercion(ListNode head, int val) {
        ListNode newListNode = crearNodo(val);

        if (head == null) {
            head = newListNode;
        } else {
            ListNode actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newListNode;
        }

        return head;
    }

    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode head3 = null;
        int acarreo = 0;

        while (head1 != null || head2 != null) {
            int suma = acarreo;
            if (head1 != null) {
                suma += head1.val;
                head1 = head1.next;
            }

            if (head2 != null) {
                suma += head2.val;
                head2 = head2.next;
            }

            acarreo = suma / 10;
            head3 = insercion(head3, suma % 10);
        }

        if (acarreo > 0) {
            head3 = insercion(head3, acarreo);
        }

        return head3;
    }
}