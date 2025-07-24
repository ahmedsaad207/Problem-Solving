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
        Set<ListNode> set = new HashSet<>();
        
        // using HashSet, space= O(n), time O(m)
        // while (headA != null) {
        //     set.add(headA);
        //     headA = headA.next;
        // }

        // while (headB != null) {
        //     if (set.contains(headB)) {
        //         return headB;
        //     }
        //     headB = headB.next;
        // }

        // Using space complexity O(1), time = O(n+m)
        ListNode pA=headA, pB=headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        return pA;

       // return null;
    }
}